package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void isAnagram(String word1, String word2 ){

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean result = Arrays.equals(charArray1, charArray2);

        if(result){
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        }
        else{
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are  not anagrams.");
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:" + "\n" + "Enter the first string: ");
        String word1 = input.next();
        System.out.print("Enter the second string: ");
        String word2 = input.next();

        isAnagram(word1, word2);

    }
}
