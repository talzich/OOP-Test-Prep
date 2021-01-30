package Design_Patterns.Iterator;

import javax.management.loading.PrivateMLet;
import java.util.*;

public class Lakers implements PlayerIterator{

    HashSet<Player> bestPlayers;
    int index = 0;

    public Lakers(){
        bestPlayers = new HashSet<>();
        addPlayer("Kobe Bryant", 5, 24);
        addPlayer("Shaquille O'Neal", 4, 34);
        addPlayer("Magic Johnson", 5, 32);
    }

    public void addPlayer(String name, int champs, int jersey){
        bestPlayers.add(new Player(name, champs, jersey));
    }

    @Override
    public Iterator createIterator() {
        return bestPlayers.iterator();
    }
}