package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.*;

public class App {
    public static void main(String[] args){
        Random random = new Random();

        List<String> names = new ArrayList<String>();
        System.out.print("Enter a name: ");
        try(Scanner input = new Scanner(System.in);) {
            names.add(input.next());

            while ((input.nextLine()).length() > 0) {
                System.out.print("The winner is " + names.get(random.nextInt(names.size())));


            }
        }
    }
}
