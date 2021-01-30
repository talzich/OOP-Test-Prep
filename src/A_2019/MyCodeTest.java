package A_2019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCodeTest {

    A_2019.car car = new MyCar();

    void delay(long time){
        long t1 = System.currentTimeMillis();
        long t2 = System.currentTimeMillis();

        while(t2 - t1 < time){
            t2 = System.currentTimeMillis();
        }
    }

    @Test
    void rightCode(){
        car_code code = new MyCode(car, "1231#");

        assertFalse(code.isOpen());
        code.open("1231#");
        assertTrue(code.isOpen());
    }

    @Test
    void wrongCodeOnce(){
        car_code code = new MyCode(car, "1231#");

        assertTrue(code.canBeOpen());
        assertFalse(code.isOpen());

        code.open("1234#");
        assertFalse(code.isOpen());

        code.open("1231#");
        assertTrue(code.isOpen());
    }

    @Test
    void timeOpen(){
        car_code code = new MyCode(car, "1231#");

        assertFalse(code.isOpen());
        code.open("1231#");

        delay(10000);
        assertTrue(code.isOpen());

        delay(60000);
        assertFalse(code.isOpen());
    }

    @Test
    void wrongCodeThreeTimes(){
        car_code code = new MyCode(car, "1231#");

        for (int i = 0; i < 3; i++) {
            assertTrue(code.canBeOpen());
            code.open("1234#");
        }
        assertFalse(code.canBeOpen());
    }
}