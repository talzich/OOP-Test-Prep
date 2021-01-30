package A_2018;

import java.util.ArrayList;

public class AveOfFunctions implements function{

    private ListOfFunctions myList;
    private double x0;

    public AveOfFunctions(ListOfFunctions listOfFunctions){
        myList = listOfFunctions;
    }

    public AveOfFunctions(){}

    public void setX0(double x0) {
        this.x0 = x0;
    }

    @Override
    public double f(double x) {
        if (myList == null || myList.size() == 0) return Double.NEGATIVE_INFINITY;

        double sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.getFunction(i).f(x);
        }
        return (sum/myList.size());
    }
}
