package A_2018;

import java.util.Comparator;

public class FunctionComperator implements Comparator<function> {

    double x;

    public FunctionComperator(double x0){
        this.x = x0;
    }

    @Override
    public int compare(function o1, function o2) {
        if(o1.f(x) < o1.f(x)) return 1;
        else if(o1.f(x) == o2.f(x)) return 0;
        else return -1;
    }
}
