package org.algorithms.basic;

import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int numero1 = in.nextInt();
        int numero2 = in2.nextInt();

        if(numero1 > numero2){
            System.out.printf("Number1 %s é maior que Number2 %s", numero1, numero2);
        } else {
            System.out.printf("Number2 %s é maior que Number1 %s", numero2, numero1);
        }
    }
}
