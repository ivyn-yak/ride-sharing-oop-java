package RideSharingApp;
// import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int phoneNumber;
    private String type;
    private String userId;
    private static int id = 1000;
    private List<AcceptedTrip> tripHistory = new ArrayList<>();


    public User(String name, int phoneNumber, String type) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
        setUserID();
        this.tripHistory = new ArrayList<>();

        // System.out.println(name + " " + phoneNumber + " " + type + " " + userId);
        // in.close();
    }

    private void setUserID() {
        id++;
        this.userId = type + "" + id;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public List<AcceptedTrip> getTripHistory() {
        return tripHistory;
    }
}
