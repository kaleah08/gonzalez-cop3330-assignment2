package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String str = input.next();
        String[] numbers = new String[0];
        for(int i = 0; i < str.length();i ++) {
           numbers = str.split("");
        }
        filterEvenNumbers(numbers);





    }
    public static void filterEvenNumbers(String[] numbers){
        int size = numbers.length;
        int [] array = new int [size];
        for(int i = 0; i < size; i++ ){
            array[i] = Integer.parseInt(numbers[i]);


        }

            System.out.print(Arrays.toString(array));



    }
}
