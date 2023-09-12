package org.algorithms.basic;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float number1 = num.nextFloat();
        float number2 = num.nextFloat();
        float number3 = num.nextFloat();

        float result = (number1 + number2 + number3) / 3;
        System.out.println(result);
    }
}
