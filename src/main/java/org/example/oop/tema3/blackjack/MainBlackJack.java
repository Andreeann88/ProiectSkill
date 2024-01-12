package org.example.oop.tema3.blackjack;

public class MainBlackJack {
    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();

        int primaCarte = Blackjack.parseCard("ace");
        int aDouaCarte = Blackjack.parseCard("king");

        String rezultat = blackjack.firstTurn("ace","king","ace");
        System.out.println(rezultat);
    }
}
