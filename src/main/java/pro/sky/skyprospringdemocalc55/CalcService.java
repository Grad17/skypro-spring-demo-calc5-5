package pro.sky.skyprospringdemocalc55;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public String hello() {
        return "hello";
    }

    public String answerHello(String userName) {
        return "<b>hello</b>" + " " + userName;
    }

    public int calc(int num1, char operation, int num2) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, operation, num2);//рекурсия
        }
        return result;
    }
}
