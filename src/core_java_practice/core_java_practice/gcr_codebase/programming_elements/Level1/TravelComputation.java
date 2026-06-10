package core_java_practice.core_java_practice.gcr_codebase.programming_elements.Level1;

// Create TravelComputation Class to compute the Distance and Travel Time
public class TravelComputation {

    public static void main(String[] args) {

        // Create a variable name to indicate the person traveling
        String name = "Eric";

        // Create variables to indicate cities
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distance from Chennai to Vellore
        double distanceFromToVia = 156.6;

        // Time from Chennai to Vellore in minutes
        int timeFromToVia = (4 * 60) + 4;

        // Distance from Vellore to Bangalore
        double distanceViaToFinalCity = 211.8;

        // Time from Vellore to Bangalore in minutes
        int timeViaToFinalCity = (4 * 60) + 25;

        // Compute total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Compute total time
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display travel details
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity +
                " to " + toCity +
                " via " + viaCity +
                " is " + totalDistance +
                " km and the Total Time taken is " +
                totalTime + " minutes");
    }
}
