package A_2019;

import A_2019.car;

public interface car_code {

    /**
     * Allows opening of the code
     * @param key
     * @return True if code was tru
     */
    public boolean open(String key);

    /**
     *
     * @return Status of code
     */
    public boolean isOpen();

    /**
     * @return True if code is can be opened
     */
    public boolean canBeOpen();

    public car getCar();
}
