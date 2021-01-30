package Design_Patterns.Iterator;

public class Player {

    String name;
    int championships;
    int jersey;

    public Player(String name, int championships, int jersey){
        this.name = name;
        this.championships = championships;
        this.jersey = jersey;
    }

    public String getName(){return name;}
    public int getChampionships(){return championships;}
    public int getJersey(){return jersey;}
}
