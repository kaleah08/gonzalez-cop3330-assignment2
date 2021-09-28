package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */


import java.util.Scanner;
import static java.lang.System.in;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        int r;
        System.out.print("What is the rate of return? ");


        while (!(input.hasNextInt())  ){

            System.out.print("Sorry. That's not a valid input." + "\n");
            input.next();
            System.out.print("What is the rate of return? ");

        }

        r = input.nextInt();

        int years = 72/r;
        System.out.println("It will take " + years + " years to double your initial investment.");

    }
}
