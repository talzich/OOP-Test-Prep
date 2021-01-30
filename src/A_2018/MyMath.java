package A_2018;

import java.util.HashMap;

public class MyMath {

    static HashMap<String, Long> myMap = new HashMap<>();

    public static long f(String s){
        if(!myMap.containsKey(s)){
            myMap.put(s, (long)s.length());
        }
        return myMap.get(s);
    }

}
