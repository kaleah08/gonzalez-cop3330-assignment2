package ex26;

import java.util.Scanner;

import static java.lang.System.in;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */



public class App {
    static class PaymentCalculator{

        public static void calculateMonthsUntilPaidOff() {
        }

        static double calculateMonthsUntilPaidOff(double APR, double balance, double monthlyPayment){

            APR /= 36500;


            return -(1.0/30.0) * Math.log(1 + ((balance/monthlyPayment) * (1- Math.pow((1 + APR),30)))) / Math.log(1 + APR);
        }



    }
    public static void main(String[] args){
        Scanner input = new Scanner(in);


        System.out.print("What is your balance? ");
        String firstString = input.next();
        double balance = Double.parseDouble(firstString);

        System.out.print("What is the APR on the card (as a percent)? ");
        String secondString = input.next();
        double APR = Double.parseDouble(secondString);

        System.out.print("What is the monthly payment you can make? ");
        String thirdString = input.next();
        double monthlyPayment = Double.parseDouble(thirdString);

        double months = (PaymentCalculator.calculateMonthsUntilPaidOff(APR, balance, monthlyPayment) );


        System.out.println("It will take you " + Math.round(months + 1)  + " months to pay off this card. ");


    }
}

