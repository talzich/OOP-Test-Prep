package A_2019;

import java.util.Date;

public class MyCar implements car {

    car_code code;
    Date timeLastRan;
    private boolean isRunning = false;

    public MyCar(){}

    public MyCar(car_code code){
        this.code = code;
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public boolean open(String key) {
        if(code.open(key)) {
            isRunning = true;
            timeLastRan = new Date();
            return true;
        }
        else return false;
    }

    @Override
    public Date lastRun() {
        return timeLastRan;
    }
}
