package com.example.numberstowords;

/*
    Java Bootcamp Assignment: Numbers to Words
    Developer: Kim Levin 1/26/2018
    Purpose:   This program accepts user input, which is an integer, converts it into words.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String intToWords() {

        System.out.print("Enter a number between 1 and 10: ");
        Scanner keyboard = new Scanner(System.in);
        String numStr = keyboard.next();

        String[] tensNums = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        int num = Integer.parseInt(numStr);
        while (!numStr.equalsIgnoreCase("x") && (num <1) ||( num > 10)) {
            if (num < 1 || num > 10) {
                System.out.println("Invalid entry");
                System.out.println("Enter a number between 1 and 10: ");
                keyboard = new Scanner(System.in);
                numStr = keyboard.next();
                num = Integer.parseInt(numStr);
            } else {
                return tensNums[num];
            }
        }

        return "Kim this works!";

    }
}
