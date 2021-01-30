package Design_Patterns.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Celtics implements PlayerIterator{

    Player[] players;
    int index = 0;

    public Celtics(){
        players = new Player[3];
        addPlayer("Larry Bird", 3, 33);
        addPlayer("Kyrie Erving", 1, 11);
        addPlayer("Bill Russel", 11, 6);
    }

    public void addPlayer(String name, int champs, int jersey){
        players[index++] = new Player(name, champs, jersey);
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(players).iterator();
    }
}