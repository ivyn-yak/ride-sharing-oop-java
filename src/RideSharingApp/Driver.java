package RideSharingApp;

public class Driver extends User {
    private double rating;
    private boolean isAvailable;

    public Driver(String name, int phoneNumber) {
        super(name, phoneNumber, "D");
        this.isAvailable = true;
        this.rating = 0;
        System.out.println("New Driver created: " + name + " " + getUserId());

    }

    public AcceptedTrip acceptTrip(TripRequest req) {
        if (isAvailable) {
            req.setRequestStatus("Driver found. Driver is " + getName());
            System.out.println(req.getStatus());
            System.out.println("Trip accepted! Heading to pick up " + req.getPassenger().getName()); 

            AcceptedTrip acceptedTrip = new AcceptedTrip(req, this);
            return acceptedTrip;
        }

        System.out.println("No Drivers available."); 
        return null;
    }

    public boolean toggleAvailability() {
        this.isAvailable = !this.isAvailable;
        return isAvailable;
    }


    private double calculateRating() {
        double ttl = 0;
        int count = 0;
        for (AcceptedTrip trip : getTripHistory()) {
            Double tripRating = trip.getRating();
            if (tripRating != null) {
                ttl += tripRating;
                count++;
            }
            
        }   

        if (count > 0) {
            this.rating = ttl / count;
        } else {
            this.rating = 0.0; 
        }
        return this.rating;
    }



}
