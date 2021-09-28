package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Scanner;
import java.util.Random;

public class App {
    private static String[] choices = new String[] {"Yes", "No", "Maybe", "Ask again later."};


    public static void main(String[] args){
        Random random = new Random();
        System.out.print("What's your question? \n" );
        try( Scanner input = new Scanner(System.in);){
            System.out.print(">");
            while((input.nextLine()).length() > 0){
                System.out.print(choices[random.nextInt(choices.length)]);
                System.out.print("\n>");

            }
        }
    }
}
