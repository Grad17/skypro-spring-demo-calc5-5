package pro.sky.skyprospringdemocalc55;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceParameterizedTest {

    private CalcService service = new CalcService();

    @ParameterizedTest
    @MethodSource("provideNumsForSum")
    void sumCalc(Double number1, Double number2, Double expected) {
        var actual = service.sumCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNumsForMinus")
    void minusCalc(Double number1, Double number2, Double expected) {
        var actual = service.minusCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNumsForMultiply")
    void multiplyCalc(Double number1, Double number2, Double expected) {
        var actual = service.multiplyCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideNumsForDivide")
    void divideCalc(Double number1, Double number2,Double expected) {
        var actual = service.divideCalc(number1, number2);
        assertEquals(expected, actual);
    }
    private static Stream<Arguments> provideNumsForDivide() {
        return Stream.of(
                Arguments.of(8.0, 4.0, 2.0),
                Arguments.of(10.0, 5.0, 2.0),
                Arguments.of(12.0, 2.0, 6.0),
                Arguments.of(100.0, -5.0, -20.0)
        );
    }

    private static Stream<Arguments> provideNumsForMultiply() {
        return Stream.of(
                Arguments.of(4.0, 4.0, 16.0),
                Arguments.of(5.0, 5.0, 25.0),
                Arguments.of(6.0, 2.0, 12.0),
                Arguments.of(5.0, 25.0, 125.0)
        );
    }

    private static Stream<Arguments> provideNumsForMinus() {
        return Stream.of(
                Arguments.of(4.0, 4.0, 0.0),
                Arguments.of(20.0, 5.0, 15.0),
                Arguments.of(6.0, 2.0, 4.0),
                Arguments.of(-10.0, 25.0, -35.0)
        );
    }

    private static Stream<Arguments> provideNumsForSum() {
        return Stream.of(
                Arguments.of(1.0, 10.0, 11.0),
                Arguments.of(50.0, -6.0, 44.0),
                Arguments.of(8.0, 4.0, 12.0),
                Arguments.of(33.0, 44.0, 77.0)
        );
    }
}