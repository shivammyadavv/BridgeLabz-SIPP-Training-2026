package core_java_practice.core_java_practice.gcr_codebase.recursion.recursion_practice;

public class TowerOfHanoi {

    public static void solveTowerOfHanoi(
            int numberOfDisks,
            char source,
            char auxiliary,
            char destination) {

        if (numberOfDisks == 1) {
            System.out.println(
                    "Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(
                numberOfDisks - 1,
                source,
                destination,
                auxiliary);

        System.out.println(
                "Move disk " + numberOfDisks +
                        " from " + source +
                        " to " + destination);

        solveTowerOfHanoi(
                numberOfDisks - 1,
                auxiliary,
                source,
                destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;

        solveTowerOfHanoi(
                numberOfDisks,
                'A',
                'B',
                'C');
    }
}
