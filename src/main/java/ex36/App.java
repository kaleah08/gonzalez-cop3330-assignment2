package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 kaleah gonzalez
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void average(List<Double> array){
        int length = array.size();
        double sum = 0.0;
        for (Double aDouble : array) {
            sum += aDouble;
        }
        double average = sum / length;
        System.out.print("The average is: " + average + "\n");

    }

    public static void max(List<Double> array){
        double maximum = array.get(0);
        for(int i = 1; i < array.size(); i++){
            if(array.get(i) > maximum){
                maximum = array.get(i);
            }
        }
        System.out.print("The maximum is " + maximum + "\n");

    }

    public static void min(List<Double> array){
        double minimum = array.get(0);
        for(int i = 1; i < array.size(); i++){
            if(array.get(i) < minimum){
                minimum = array.get(i);
            }
        }
        System.out.print("The minimum is " + minimum + "\n");

    }

    public static void std(List<Double> array){
        double sum = 0.0, std = 0.0, sq = 0.0, res = 0.0;
        int length = array.size();
        for (Double value : array) {
            sum += value;
        }
        double mean = sum / length;

        for (Double aDouble : array) {
            std += Math.pow(aDouble - mean, 2);
        }
        sq = std / length - 1;
        res = Math.sqrt(sq);
        System.out.print("The standard deviation is " + String.format("%.2f",res));
    }



    public static void main(String[] args){

        Scanner input = new Scanner(in);
        String done = "done";

        List<Double> numbers = new ArrayList<Double>();
        System.out.print("Enter a number: ");

        while(input.hasNextDouble() || !(done.equals(input.next()))) {

           numbers.add(input.nextDouble());
           System.out.print("Enter a number: ");

        }
        System.out.print("Numbers: " + numbers + "\n");
        average(numbers);
        min(numbers);
        max(numbers);
        std(numbers);









    }
}
