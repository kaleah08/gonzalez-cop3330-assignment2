package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */


import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        int result = 0, numbers = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numbers = input.nextInt();
            result += numbers;

        }
        System.out.println("The total is " + result + ".");
    }
}
