package core_java_practice.core_java_practice.gcr_codebase.recursion.scenario_based;

public class ConsecutiveSensorReadings {

    public static boolean isStrictlyIncreasing(
            int[] temperatureReadings,
            int currentIndex) {

        // Base Case
        if (currentIndex == temperatureReadings.length - 1) {
            return true;
        }

        // Check current and next reading
        if (temperatureReadings[currentIndex]
                >= temperatureReadings[currentIndex + 1]) {
            return false;
        }

        // Recursive Call
        return isStrictlyIncreasing(
                temperatureReadings,
                currentIndex + 1);
    }

    public static void main(String[] args) {

        int[] temperatureReadings = {12, 15, 18, 22, 30};

        boolean result =
                isStrictlyIncreasing(temperatureReadings, 0);

        System.out.println(result);
    }
}
