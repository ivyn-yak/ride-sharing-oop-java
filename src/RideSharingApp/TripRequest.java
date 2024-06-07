package RideSharingApp;

public class TripRequest {
    private String pickupLocation;
    private String dropoffLocation;
    private Passenger passenger;
    private String tripId;
    private static int id = 1000;
    private String status;

    public TripRequest(String pickupLocation, String dropoffLocation, Passenger passenger) {
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.passenger = passenger;
        this.tripId = setTripId(); 
        this.status = "Finding a driver..."; 

        System.out.println("Passenger " + passenger.getName() + " going from " + pickupLocation + " to " + dropoffLocation + " " + status);
        System.out.println(tripId);
    }

    private String setTripId() {
        id++;
        return "T" + "" + id;
    }

    public void setRequestStatus(String update){
        this.status = update;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public String getStatus() {
        return status;
    }

    public String getTripId() {
        return tripId;
    }
}
