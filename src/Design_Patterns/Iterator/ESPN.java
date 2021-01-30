package Design_Patterns.Iterator;

public class ESPN {

    public static void main(String[] args) {

        Bulls bullsPlayers = new Bulls();
        Celtics celticsPlayers = new Celtics();
        Lakers lakersPlayers = new Lakers();

        Reporter steve = new Reporter(bullsPlayers, celticsPlayers, lakersPlayers);
        steve.readOutPLayers();
    }
}
