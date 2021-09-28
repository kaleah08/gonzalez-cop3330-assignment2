package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Scanner;

import static java.lang.System.in;

public class App {


    public static void firstName(String firstName){

        while( (firstName.length() < 2)){
            System.out.print("The first name must be at least 2 characters long.");
        }
        while((firstName.length() < 1)){
            System.out.print("The first name must be filled in.");
        }

    }


    public static void lastName(String lastName){
        while( (lastName.length() < 2)){
            System.out.print("The first name must be at least 2 characters long.");
        }
        while((lastName.length() < 1)){
            System.out.print("The first name must be filled in.");
        }


    }

    public static void employeeID(String employeeID){

        if((employeeID.length() == 7)){
            for (int i = 0; i < employeeID.length(); i ++){



            }

        }




    }


    public static void validInput(int employeeID){

    }

    public static void main(String[] args){
        Scanner input = new Scanner(in);
        System.out.print("Enter the first name: ");
        String firstname = input.next();


        System.out.print("Enter the last name: ");
        String lastName = input.next();

        System.out.print("Enter the employee ID name: ");
        String firstString = input.next();
        int employeeID = Integer.parseInt(firstString);

        System.out.print("Enter the ZIP code: ");
        String secondString = input.next();
        int zipCode = Integer.parseInt(secondString);
    }

}
