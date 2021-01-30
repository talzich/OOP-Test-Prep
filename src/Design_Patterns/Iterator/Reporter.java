package Design_Patterns.Iterator;

import java.util.Iterator;

public class Reporter {

     private PlayerIterator bulls;
     private PlayerIterator celtics;
     private PlayerIterator lakers;

     public Reporter(PlayerIterator bullsIter, PlayerIterator celticsIter, PlayerIterator LakersIter){
         bulls = bullsIter;
         celtics = celticsIter;
         lakers = LakersIter;
     }

     public void readOutPLayers(){
         Iterator bullsIter = bulls.createIterator();
         Iterator celticsIter = celtics.createIterator();
         Iterator lakersIter = lakers.createIterator();

         System.out.println("Bulls best Players: \n");
         printPlayers(bullsIter);

         System.out.println("Celtics best Players: \n");
         printPlayers(celticsIter);

         System.out.println("Lakers best Players: \n");
         printPlayers(lakersIter);
     }

     private void printPlayers(Iterator iterator){

         while (iterator.hasNext()){

             Player currPlayer = (Player) iterator.next();
             System.out.println("#" + currPlayer.getJersey() + "\t" + currPlayer.getName());
             System.out.println("Championships: " +currPlayer.getChampionships()+"\n");
         }
         System.out.println("\n");
     }
}
