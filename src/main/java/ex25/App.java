package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Scanner;

public class App {
    public static void passwordValidator(String password){
        // Checking lower alphabet in string
        int n = password.length();

        boolean hasLower = false, hasDigit = false, specialChar = false;

        for (char i : password.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if ((password.contains("@") || password.contains("#")
                    || password.contains("!") || password.contains("~")
                    || password.contains("$") || password.contains("%")
                    || password.contains("^") || password.contains("&")
                    || password.contains("*") || password.contains("(")
                    || password.contains(")") || password.contains("-")
                    || password.contains("+") || password.contains("/")
                    || password.contains(":") || password.contains(".")
                    || password.contains(", ") || password.contains("<")
                    || password.contains(">") || password.contains("?")
                    || password.contains("|")))
                specialChar = true;
        }

        System.out.print("The password '" + password + "' ");

        if(!(hasLower) && !(specialChar) && (n <= 8))
            System.out.print("is a very weak password.");
        else if(!(hasDigit) && !(specialChar) && (n <= 8))
            System.out.print("is a weak password.");
        else if(hasDigit && hasLower && !(specialChar) && (n >= 8))
            System.out.print("is a strong password.");
        else if(hasDigit && hasLower  && specialChar && (n >= 8))
            System.out.print("is a very strong password.");



    }



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        passwordValidator(password);


    }

}
