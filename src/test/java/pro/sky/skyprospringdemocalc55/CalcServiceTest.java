package pro.sky.skyprospringdemocalc55;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {

    private CalcService service = new CalcService();

    @Test
    void sumCalc() {
        assertEquals(9.0, service.sumCalc(5.0, 4.0));
        assertEquals(27.0, service.sumCalc(51.0, -24.0));
    }

    @Test
    void minusCalc() {
        assertEquals(25.0, service.minusCalc(34.0, 9.0));
        assertEquals(0.0, service.minusCalc(-8.0, -8.0));
    }

    @Test
    void multiplyCalc() {
        assertEquals(-10.0, service.multiplyCalc(-2.0, 5.0));
        assertEquals(22.0, service.multiplyCalc(11.0, 2.0));
    }

    @Test
    void divideCalc() {
        assertEquals(3.0, service.divideCalc(6.0, 2.0));
        assertEquals(2.5, service.divideCalc(10.0, 4.0));
    }
    {
        var result = service.divideCalc(10.0, 0.0);
        assertEquals(0.0, result);
    }
}