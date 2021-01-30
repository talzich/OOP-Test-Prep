package Design_Patterns.Singleton;

import java.util.LinkedList;

public class Player implements Runnable{

    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("Pot ID: " +System.identityHashCode(instance));
        System.out.println("Tiles in pot: " + instance.getLetters());
        LinkedList<String> myTiles = instance.getTiles(7);
        System.out.println("Player drew: " +myTiles);
    }
}
