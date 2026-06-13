package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level2;

import java.util.Scanner;

public class RockPaperScissorsGame {

    // Computer choice
    public static String getComputerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        }

        return "Scissors";
    }

    // Find winner
    public static String findWinner(String user,
                                    String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") &&
                computer.equals("Scissors")) ||

                (user.equals("Paper") &&
                        computer.equals("Rock")) ||

                (user.equals("Scissors") &&
                        computer.equals("Paper"))) {

            return "User";
        }

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number Of Games: ");
        int totalGames = scanner.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int game = 1; game <= totalGames; game++) {

            System.out.print(
                    "Enter Rock/Paper/Scissors: ");

            String userChoice = scanner.next();

            String computerChoice =
                    getComputerChoice();

            String winner =
                    findWinner(userChoice,
                            computerChoice);

            System.out.println("Computer : "
                    + computerChoice);

            System.out.println("Winner : "
                    + winner);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        double userPercentage =
                (userWins * 100.0) / totalGames;

        double computerPercentage =
                (computerWins * 100.0) / totalGames;

        System.out.println("\nUser Wins : "
                + userWins);

        System.out.println("Computer Wins : "
                + computerWins);

        System.out.println("User Win % : "
                + Math.round(userPercentage * 100) / 100.0);

        System.out.println("Computer Win % : "
                + Math.round(computerPercentage * 100) / 100.0);
    }
}
