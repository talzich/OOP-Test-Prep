package A_2018;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListOfFunctions {

    private ArrayList<function> myCollection =  new ArrayList<>();

    public void add(function f){
        myCollection.add(f);
    }

    public int size(){
        return myCollection.size();
    }

    public function getFunction(int i){
        if(i < 0 || i >= myCollection.size()) return null;
        else return myCollection.get(i);
    }
}
