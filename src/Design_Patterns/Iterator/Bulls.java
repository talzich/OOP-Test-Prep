package Design_Patterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Bulls implements PlayerIterator{

    ArrayList<Player> bestPlayers;

    public Bulls(){
        bestPlayers = new ArrayList<>();
        addPlayer("Michael Jordan", 6, 23);
        addPlayer("Scottie Pipen", 6, 33);
        addPlayer("Denis Rodman", 5, 91);
    }

    public void addPlayer(String name, int champs, int jersey){
        bestPlayers.add(new Player(name, champs, jersey));
    }

    @Override
    public Iterator createIterator() {
        return bestPlayers.iterator();
    }
}
