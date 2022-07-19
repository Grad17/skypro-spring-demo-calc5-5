package pro.sky.skyprospringdemocalc55;

import org.springframework.stereotype.Service;

@Service
public class CalcService implements CalculatorInterface {
    public String welcomeCalc() {
        return "Добро пожаловать в калькулятор. Выберете операцию и введите числа: /plus, /minus, /multiply, /divide";
    }
    public double sumCalc(Double number1, Double number2) {
        return number1 + number2;
    }
    public double minusCalc(Double number1, Double number2) {
        return number1 - number2;
    }
    public double multiplyCalc(Double number1, Double number2) {
        return number1 * number2;
    }
    public double divideCalc(Double number1, Double number2) {
        return number1 / number2;
    }
}