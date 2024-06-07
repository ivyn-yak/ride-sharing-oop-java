package RideSharingApp;


public class Passenger extends User {

    public Passenger(String name, int phoneNumber) {
        super(name, phoneNumber, "P");
        System.out.println("New Passenger created: " + name + " " + getUserId());

    }

    
}

