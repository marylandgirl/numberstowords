package com.example.numberstowords;

/*
    Java Bootcamp Assignment: Numbers to Words
    Developer: Kim Levin 1/26/2018
    Purpose:   This program accepts user input, which is an integer, converts it into words.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String intToWords(@RequestParam String numStr) {
        String[] tensNums = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        boolean parsable = isParsable(numStr);
        int num = Integer.parseInt(numStr);
        boolean isValid = parsable && (num >= 1 && num <=10);

        if (! isValid) {
            return "Invalid input!";
        }

        String retStr = tensNums[num];

        return retStr;
    }

    public static boolean isParsable(String numStr){
        boolean isParsable = true;
        try {
            Integer.parseInt(numStr);
        } catch (Exception e) {
            isParsable = false;
        }
        return isParsable;
    }
}
