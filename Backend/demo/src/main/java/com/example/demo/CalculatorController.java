package com.example.demo;
import javax.naming.spi.DirStateFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
     @GetMapping("/add")
     public Calculator add(@RequestParam(value="num1", defaultValue= 0)double num1, (@RequestParam(value="num2", defaultValue= 0 )double num2){
        return new Calculator("resultado", String.valueOf(num1 + num2));
     }

    @GetMapping("/sub")
     public Calculator sub(@RequestParam(value="num1", defaultValue= 0 )double num1, (@RequestParam(value="num2", defaultValue= 0 )double num2){
        return new Calculator("resultado", String.valueOf(num1 - num2));

    }
}