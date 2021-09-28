package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Scanner;

public class App {
    private static Character[] character = {'!' , '@' , '#', '$', '%', '^', '&','*','?'};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();



        System.out.print("How many special characters? ");
        int specialCharacters = input.nextInt();

        System.out.print("How many numbers? ");
        int numbers = input.nextInt();

        String randomPass = "";
        for(int i =0; i <minLength; i++){
            randomPass += randomCharacter();
        }
        System.out.print(randomPass);
    }
    public static char randomCharacter(){
        int rand = (int)(Math.random()*62);
        if(rand<= 9){
            int number = rand + 48;
            return (char)(number);
        }
        else if(rand<= 35){
            int uppercase = rand + 55;
            return (char)(uppercase);

        }
        else{
            int lowercase = rand + 61;

            return (char)(lowercase);
        }
    }
}
