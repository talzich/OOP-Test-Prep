package B_2019;

class Tester implements Runnable{

    // This thread's "jurisdiction"
    private final int MIN;
    private final int MAX;
    static boolean flag = false;

    // Length of sought password
    private final int LENGTH;

    public Tester(int min, int max, int length){
        MIN = min;
        MAX = max;
        LENGTH = length;
    }

    /**
     * Runs numbers and compares them to an unknown correct password
     * @return - the password, if found. "Error" otherwise.
     */
    private String findPass(){
        for (int i = MIN; i < MAX && !flag; i++) {
            String testThis = getStringfromInt(i, LENGTH);
            if(Q2.testPass(testThis)) {
                flag = true;
                return testThis;
            }
        }
        return "Error";
    }

    /**
     * @param i - the integer we want to convert
     * @param length - length of wanted string
     * @return A string with `length`  characters from an integer and pads it with zeros if needed
     */
    private String getStringfromInt(int i,int length) {
        String s = ""+i;
        while(s.length()<length)
            s="0" + s;
        return s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " +findPass());
    }
}

public class Q2 {

    private static final String pass = "00000000";

    public static boolean testPass(String s){
        return (s.equals(pass));
    }

    public static void main(String[] args) {

        final int MAX = 1000*1000*100;
        final int LENGTH = 8;

        Thread tester1 = new Thread(new Tester(0, (MAX-1)/3, LENGTH));
        Thread tester2 = new Thread(new Tester((MAX-1)/3, ((MAX-1)/3)*2, LENGTH));
        Thread tester3 = new Thread(new Tester(((MAX-1)/3)*2, MAX, LENGTH));

        tester1.start();
        tester2.start();
        tester3.start();

    }
}
