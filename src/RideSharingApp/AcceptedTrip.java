package RideSharingApp;
import java.time.LocalDateTime;

public class AcceptedTrip{
    private String pickupLocation;
    private String dropoffLocation;
    private Passenger passenger;
    private Driver driver;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double fare;
    private double distance;
    private boolean paymentStatus;
    private Double rating = null;

    public AcceptedTrip(TripRequest tripRequest, Driver driver) {
        
        this.pickupLocation = tripRequest.getPickupLocation();
        this.dropoffLocation = tripRequest.getDropoffLocation();
        this.passenger = tripRequest.getPassenger();
        this.driver = driver;
        this.startTime = LocalDateTime.now(); 
        tripRequest.setRequestStatus("Driver is on the way..."); 
        this.paymentStatus = false; 
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating(){
        return rating;
    }
}
