package org.algorithms.basic;

import java.util.Scanner;

public class SimpleInterestCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the debt amount");
        float value = s.nextFloat();

        System.out.println("Enter the interest amount");
        float interest = s.nextFloat()/ 100;

        System.out.println("Enter the number of months");
        int months = s.nextInt();

        float result = value * (1 + interest * months);

        System.out.println("O juros é " + result);

    }
}
