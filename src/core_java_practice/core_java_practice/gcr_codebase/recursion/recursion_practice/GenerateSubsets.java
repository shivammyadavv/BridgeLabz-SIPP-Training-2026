package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class GenerateSubsets {

    public static void generateSubsets(int[] numbers, int index, String subset) {

        if (index == numbers.length) {
            System.out.println("[" + subset + "]");
            return;
        }

        generateSubsets(numbers, index + 1, subset);

        String newSubset;

        if (subset.isEmpty()) {
            newSubset = String.valueOf(numbers[index]);
        } else {
            newSubset = subset + "," + numbers[index];
        }

        generateSubsets(numbers, index + 1, newSubset);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2};

        generateSubsets(numbers, 0, "");
    }
}
