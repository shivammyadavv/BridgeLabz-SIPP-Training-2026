package core_java_practice.core_java_practice.gcr_codebase.strings_practices.Level3;

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits =
                {"Hearts",
                        "Diamonds",
                        "Clubs",
                        "Spades"};

        String[] ranks =
                {"2","3","4","5","6",
                        "7","8","9","10",
                        "Jack","Queen",
                        "King","Ace"};

        int totalCards =
                suits.length
                        * ranks.length;

        String[] deck =
                new String[totalCards];

        int cardIndex = 0;

        for (int suit = 0;
             suit < suits.length;
             suit++) {

            for (int rank = 0;
                 rank < ranks.length;
                 rank++) {

                deck[cardIndex] =
                        ranks[rank]
                                + " of "
                                + suits[suit];

                cardIndex++;
            }
        }

        return deck;
    }

    public static void shuffleDeck(
            String[] deck) {

        int totalCards =
                deck.length;

        for (int index = 0;
             index < totalCards;
             index++) {

            int randomCard =
                    index +
                            (int)
                                    (Math.random()
                                            * (totalCards - index));

            String temporary =
                    deck[index];

            deck[index] =
                    deck[randomCard];

            deck[randomCard] =
                    temporary;
        }
    }

    public static String[][] distributeCards(
            String[] deck,
            int players,
            int cardsPerPlayer) {

        String[][] playerCards =
                new String[players]
                        [cardsPerPlayer];

        int cardIndex = 0;

        for (int player = 0;
             player < players;
             player++) {

            for (int card = 0;
                 card < cardsPerPlayer;
                 card++) {

                playerCards[player][card]
                        = deck[cardIndex];

                cardIndex++;
            }
        }

        return playerCards;
    }

    public static void displayCards(
            String[][] playerCards) {

        for (int player = 0;
             player < playerCards.length;
             player++) {

            System.out.println(
                    "\nPlayer "
                            + (player + 1));

            for (int card = 0;
                 card < playerCards[player].length;
                 card++) {

                System.out.println(
                        playerCards[player][card]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Enter Number Of Players: ");

        int players =
                scanner.nextInt();

        System.out.print(
                "Enter Cards Per Player: ");

        int cardsPerPlayer =
                scanner.nextInt();

        if (players * cardsPerPlayer > 52) {

            System.out.println(
                    "Not Enough Cards");

            return;
        }

        String[] deck =
                initializeDeck();

        shuffleDeck(deck);

        String[][] playerCards =
                distributeCards(
                        deck,
                        players,
                        cardsPerPlayer);

        displayCards(playerCards);
    }
}
