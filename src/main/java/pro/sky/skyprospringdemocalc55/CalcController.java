package pro.sky.skyprospringdemocalc55;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    @GetMapping
    public String hello() {
        return calcService.hello();
    }
    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return calcService.answerHello(userName);
    }
    @GetMapping(path = "/calc")
    public int calc(@RequestParam("calculate") int num1, char operation, int num2) {
        return calcService.calc(num1,operation,num2);
    }
}
