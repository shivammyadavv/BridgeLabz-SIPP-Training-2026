package core_java_practice.core_java_practice.gcr_codebase.methods_practice.Level2;

import java.util.Scanner;

public class FriendComparison {

    public static int findYoungestFriend(
            int[] ages) {

        int youngestIndex = 0;

        for (int index = 1;
             index < ages.length;
             index++) {

            if (ages[index]
                    < ages[youngestIndex]) {

                youngestIndex = index;
            }
        }

        return youngestIndex;
    }

    public static int findTallestFriend(
            double[] heights) {

        int tallestIndex = 0;

        for (int index = 1;
             index < heights.length;
             index++) {

            if (heights[index]
                    > heights[tallestIndex]) {

                tallestIndex = index;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] friendNames = {
                "Amar",
                "Akbar",
                "Anthony"
        };

        int[] friendAges = new int[3];
        double[] friendHeights = new double[3];

        for (int index = 0;
             index < friendNames.length;
             index++) {

            System.out.print(
                    "Enter Age of "
                            + friendNames[index]
                            + ": ");

            friendAges[index] =
                    input.nextInt();

            System.out.print(
                    "Enter Height of "
                            + friendNames[index]
                            + ": ");

            friendHeights[index] =
                    input.nextDouble();
        }

        int youngestIndex =
                findYoungestFriend(
                        friendAges);

        int tallestIndex =
                findTallestFriend(
                        friendHeights);

        System.out.println(
                "Youngest Friend = "
                        + friendNames[youngestIndex]);

        System.out.println(
                "Tallest Friend = "
                        + friendNames[tallestIndex]);

        input.close();
    }
}
