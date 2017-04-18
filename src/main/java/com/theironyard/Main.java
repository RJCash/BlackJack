package com.theironyard;

/**
 * Created by rickiecashwell on 3/21/17.
 */
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Person player1 = new Person();
        Person player2 = new Person();
        player1.setHand(deck.getHand());
        System.out.println("player 1 has: " +player1.getCurrentHand());
        System.out.println("there are "+deck.getDeck().size()+" cards left in deck");
        player2.setHand(deck.getHand());
        System.out.println("player 2 has: " +player2.getCurrentHand());
        System.out.println("there are "+deck.getDeck().size()+" cards left in deck");
    }
}
