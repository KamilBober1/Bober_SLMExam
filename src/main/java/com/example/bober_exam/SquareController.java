package com.example.bober_exam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    @GetMapping("/square")
    public int square(int number){
        int result= (int) Math.pow(number,2);
        return  result;
    }
}
