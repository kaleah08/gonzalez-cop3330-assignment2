package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args){

        Scanner input = new Scanner(in);
        System.out.print("What is your resting pulse? ");
        String firstString = input.next();
        int pulse = Integer.parseInt(firstString);

        System.out.print("What is your age? ");
        String secondString = input.next();
        int age = Integer.parseInt(secondString);
        age = 220 - age;
        System.out.print("Intensity   " + "|" + "Rate" + "\n");
        System.out.print("------------" + "|" + "------");

        for(double i = 0.55; i<= 1; i = i + .05){

           double x = ((age - pulse) * i) + pulse;

           System.out.print("\n" + String.format("%2.0f",i * 100) + "%       " +"  |"+ Math.round(x) + " bpm");

        }

    }
}
