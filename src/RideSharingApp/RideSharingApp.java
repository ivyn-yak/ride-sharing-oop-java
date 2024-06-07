package RideSharingApp;

public class RideSharingApp {
    public static void main(String[] args) {

        Passenger passenger = new Passenger("Mary", 12345678);
        Driver driver = new Driver("Barry", 98765432);

        TripRequest req = new TripRequest("Airport", "Hotel", passenger);
        AcceptedTrip trip = driver.acceptTrip(req);
        

    }
}