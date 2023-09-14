package org.algorithms.basic;

import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a altura do triângulo");
        float alt = s.nextFloat();

        System.out.println("Digite a base do triângulo");
        float base = s.nextFloat();

        float res = (alt * base)/2;

        System.out.println("A área do triângulo é igual a " + res);


    }
}
