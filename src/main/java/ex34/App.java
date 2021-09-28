package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};


        System.out.print("There are " + employees.length + " employees");
        for(int k = 0; k < employees.length-1; k++) {
            System.out.print("\n" + employees[k]);
        }
        System.out.print("\nEnter an employee name to remove: ");
        String removed = input.next();
        for(int i = 0; i < employees.length-1; i++){
            if(employees[i].equals(removed)){
                employees[i] = null;

            }
        }

        System.out.print("There are " + employees.length + " employees");
        for(int l = 0; l < employees.length-1; l++) {
            System.out.print("\n" + employees[l]);
        }


    }
}
