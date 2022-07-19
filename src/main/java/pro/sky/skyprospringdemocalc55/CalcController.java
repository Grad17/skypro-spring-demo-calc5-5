package pro.sky.skyprospringdemocalc55;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping()
    public String welcomeCalc() {
        return calcService.welcomeCalc();
    }
    @GetMapping(path = "/plus")
    public String sumCalc(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + "+" + number2 + "=" + calcService.sumCalc(number2, number1);
        }
    }
    @GetMapping(path = "/minus")
    public String minusCalc(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + "-" + number2 + "=" + calcService.minusCalc(number1, number2);
        }
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalc(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + "*" + number2 + "=" + calcService.multiplyCalc(number1, number2);
        }
    }
    @GetMapping(path = "/divide")
    public String divideCalc(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else if (number1 == 0 || number2 == 0) {
            return "Нельзя на ноль делить! Не то вселенная схлопнется!";
        } else {
            return number1 + ":" + number2 + "=" + calcService.divideCalc(number1, number2);
        }
    }
}
