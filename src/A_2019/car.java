package A_2019;

import java.util.Date;

public interface car {
    /**
     *
     * @return True if A_2019.car is running
     */
    public boolean isRunning();

    /**
     * Allows the opening of the A_2019.car.
     * @param key
     * @return Status
     */
    public boolean open(String key);

    /**
     *
     * @return Last time A_2019.car was running
     */
    public Date lastRun();
}
