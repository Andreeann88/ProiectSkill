package org.example.oop.tema3.blackjack;

public class Blackjack {
    public static int parseCard( String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        //int value1Card1 = Integer.parseInt(card1);
        //int value2Card2 = Integer.parseInt(card2);
        int value1Card1 = parseCard(card1);
        int value2Card2 = parseCard(card2);


        return value1Card1 + value2Card2 == 21;
    }


    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore == 21) {
            System.out.println("Egalitate");
        }
        return "Ai pierdut!";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore > dealerScore) {
            return "Ai castigat!";
        } else {
            return "Ai pierdut";
        }
    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

}

