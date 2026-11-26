package org.cuatrovientos._01_calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("/add/{left}/{right}")
    @ResponseBody
    public String add(@PathVariable int left, @PathVariable int right) {
        return "%d + %d = %d".formatted(left, right, left + right);
    }
    @GetMapping("/substract/{left}/{right}")
    @ResponseBody
    public String substract(@PathVariable int left, @PathVariable int right) {
        return "%d - %d = %d".formatted(left, right, left - right);
    }
    @GetMapping("/multiply/{left}/{right}")
    @ResponseBody
    public String multiply(@PathVariable int left, @PathVariable int right) {
        return "%d * %d = %d".formatted(left, right, left * right);
    }
    @GetMapping("/divide/{left}/{right}")
    @ResponseBody
    public String divide(@PathVariable float left, @PathVariable float right) {
        return "%f / %f = %f".formatted(left, right, left / right);
    }
}
