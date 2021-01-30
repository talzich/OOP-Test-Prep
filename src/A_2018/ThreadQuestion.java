package A_2018;

import java.util.HashSet;
import java.util.Set;

public class ThreadQuestion {

    static Set<String> set = new HashSet<>();

    public static synchronized void add(String s){
        set.add(s);
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 500000; ++i) {
                    String s = "" + i;
                    add(s);
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 500000; i < 1000000; ++i) {
                    String s = "" + i;
                    add(s);
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread map size=" + set.size());
    }

}
