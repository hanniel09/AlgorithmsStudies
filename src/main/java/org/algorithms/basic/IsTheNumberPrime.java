package org.algorithms.basic;

import java.util.Scanner;

public class IsTheNumberPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if((number % 2) == 0){
            System.out.println("The number is not prime " + number);
        } else {
            System.out.println("The number is prime " + number);
        }
    }
}
