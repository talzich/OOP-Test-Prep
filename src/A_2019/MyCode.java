package A_2019;

public class MyCode implements car_code{

    private String correctKey;
    private int failedTries = 0;
    private final int maxFails = 3;
    private long lockStartTime;
    private long openTime;
    private car myCar;

    public MyCode(){}

    public MyCode(car car, String correctKey){
        this.myCar = car;
        this.correctKey = correctKey;
    }

    @Override
    public boolean open(String key) {

        if(!canBeOpen()){
            System.out.println("Too many failed tries, cannot process request now");
            return false;
        }

        if(key != correctKey){
            failedTries++;
            System.out.println("Wrong key entered");

            if(failedTries == maxFails){
                lockStartTime = System.currentTimeMillis();
                System.out.println("Too many wrong entries, Code is locked for 15 minutes");
            }

            return false;
        }

        openTime = System.currentTimeMillis();
        failedTries = 0;
        return true;
    }

    @Override
    public boolean isOpen() {
        if (myCar.isRunning()) return true;
        long now = System.currentTimeMillis();
        return (now - openTime < 60000);
    }

    @Override
    public boolean canBeOpen() {
        if(failedTries < maxFails) return true;
        else{
            long now = System.currentTimeMillis();
            if(now - lockStartTime < 900000) return false;
            else{
                failedTries = 0;
                return true;
            }
        }
    }

    @Override
    public car getCar() {
        return null;
    }
}
