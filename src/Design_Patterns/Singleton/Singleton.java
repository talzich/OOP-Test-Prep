package Design_Patterns.Singleton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;

    String[] letters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};

    LinkedList<String> lettersList = new LinkedList<>(Arrays.asList(letters));

    static boolean firstThread = true;

    private Singleton(){}

    // Lazy instantiation
    public static Singleton getInstance(){

        if(firstInstance == null){

            // Demonstrating us dealing with threads, even if one goes to sleep after null check
            if(firstThread){
                firstThread = false;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Singleton.class) {
                if(firstInstance == null) {
                    firstInstance = new Singleton();
                    Collections.shuffle(firstInstance.lettersList);
                }
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetters(){
        return firstInstance.lettersList;
    }

    public LinkedList<String> getTiles(int howManyTiles){
        LinkedList<String> tilesToSend = new LinkedList<>();

        for (int i = 0; i < howManyTiles; i++) {
            tilesToSend.add(firstInstance.lettersList.remove(0));
        }

        return tilesToSend;
    }
}
