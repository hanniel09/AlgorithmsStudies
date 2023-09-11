package org.algorithms.intermediary;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float weight = in.nextFloat();
        float height = in.nextFloat();

        float bmi = weight / (height * height);
        System.out.println(bmi);
    }
}
