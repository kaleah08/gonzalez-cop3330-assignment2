package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.in;

public class App {
    public static void guessNumberGame(){
        Scanner input = new Scanner(in);
        Random random = new Random();
        System.out.print("Let's play Guess the Number! \n");

        System.out.print("Enter the difficulty level (1, 2, or 3):");
        int level = input.nextInt();

        if (level == 1) {

            int level1 = random.nextInt(11);
            boolean correctLevel1 = false;
            System.out.print("I have my number. What's your guess?");
            int count = 1;

            while (!correctLevel1) {

                int guess = input.nextInt();

                if ( guess > level1 ) {
                    System.out.print("Too high. Guess again:");
                    count++;

                } else if ( guess < level1 ) {
                    System.out.print("Too low. Guess again:");
                    count++;
                } else {

                    System.out.print("You got it in " + count + " guesses");
                    correctLevel1 = true;
                }

            }
        }
        if ( level == 2 ) {
            int level2 = random.nextInt(101);
            boolean correctLevel2 = false;
            System.out.print("I have my number. What's your guess?");
            int count = 1;

            while (!correctLevel2) {

                int guess = input.nextInt();

                if ( guess > level2 ) {
                    System.out.print("Too high. Guess again:");
                    count++;

                } else if ( guess < level2 ) {
                    System.out.print("Too low. Guess again:");
                    count++;
                } else {

                    System.out.print("You got it in " + count + " guesses");
                    correctLevel2 = true;
                }

            }

        }
        if (level == 3) {
            int level3 = random.nextInt(1001);
            boolean correctLevel3 = false;
            System.out.print("I have my number. What's your guess?");
            int count = 1;

            while (!correctLevel3) {

                int guess = input.nextInt();

                if (guess > level3) {
                    System.out.print("Too high. Guess again:");
                    count++;

                } else if (guess < level3) {
                    System.out.print("Too low. Guess again:");
                    count++;
                } else {

                    System.out.print("You got it in " + count + " guesses");
                    correctLevel3 = true;
                }

            }
        }


    }


    public static void main(String[] args){
        Scanner input = new Scanner(in);
            do{
                guessNumberGame();
                System.out.print("\n Do you wish to play again (Y/N)? ");
            }
            while(input.nextLine().equals("Y"));

    }
}
