package Design_Patterns.Singleton;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // No Threads
//        Singleton pot = Singleton.getInstance();
//        System.out.println("POT ID: " + System.identityHashCode(pot));
//        System.out.println("Letters in the pot: " + pot.getLetters());
//
//        LinkedList<String> playerOneTiles = pot.getTiles(7);
//        System.out.println("Player 1 drew: " +playerOneTiles);
//
//        Singleton newPot = Singleton.getInstance();
//        System.out.println("New pot ID: " +System.identityHashCode(newPot));
//        System.out.println("Letters in the new pot: " + newPot.getLetters());
//
//        LinkedList<String> playerTwoTiles = pot.getTiles(7);
//        System.out.println("Player 2 drew: " +playerTwoTiles);

        // Threads

        Runnable player1 = new Player();
        Runnable player2 = new Player();

        new Thread(player1).start();
        new Thread(player2).start();
    }
}
