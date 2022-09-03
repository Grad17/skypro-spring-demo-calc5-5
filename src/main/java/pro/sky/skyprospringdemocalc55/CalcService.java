package pro.sky.skyprospringdemocalc55;

import org.springframework.stereotype.Service;

@Service
public class CalcService implements CalculatorInterface {
    public String welcomeCalc() {
        return "Добро пожаловать в калькулятор. Выберете операцию и введите числа: /plus, /minus, /multiply, /divide";
    }
    public double sumCalc(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Введите число");
        }
        return number1 + number2;

    }
    public double minusCalc(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Введите число");
        }
        return number1 - number2;
    }
    public double multiplyCalc(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Введите число");
        }
        return number1 * number2;
    }
    public double divideCalc(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Введите число");
        } else if (number2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль");
        }
        return number1 / number2;
    }
}