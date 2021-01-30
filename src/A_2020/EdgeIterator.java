package A_2020;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class EdgeIterator{

    ArrayList<Integer> edgeCollection;
    int index = -1;
    int currSize;

    public EdgeIterator(ArrayList<Integer> edgeCollection){
        this.edgeCollection = edgeCollection;
        currSize = edgeCollection.size();
    }


    public boolean hasNext() {
        return (index + 1 < edgeCollection.size() && edgeCollection.get(index + 1) != null);
    }


    public Integer next() {
        return (edgeCollection.get(++index));
    }
}
