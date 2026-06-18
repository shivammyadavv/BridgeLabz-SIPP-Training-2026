package core_java_practice.core_java_practice.gcr_codebase.exception_handling.scenario_based;

public class MovieSeatReservation {

    public static int getSeat(
            int[] seats,
            int index) {

        try {

            return seats[index];

        } catch (
                ArrayIndexOutOfBoundsException exception) {

            System.out.println(
                    "Invalid Seat Position");

            return -1;
        }
    }

    public static void main(String[] args) {

        int[] seats =
                {101, 102, 103, 104, 105};

        int seatNumber =
                getSeat(seats, 8);

        System.out.println(
                "Seat Number: " + seatNumber);
    }
}
