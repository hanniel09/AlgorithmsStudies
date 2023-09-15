package org.algorithms.intermediary;

import java.util.Scanner;

public class PowerCalculationWithQuickExponentiation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("set the exponent");
        double exp = s.nextDouble();

        System.out.println("set the base");
        double power = s.nextDouble();

        double result = Math.pow(power, exp);

        System.out.println(result);

    }
}
