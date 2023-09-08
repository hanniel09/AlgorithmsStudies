package org.algorithms.basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int res = i % 2;
        if(res > 0){
            System.out.println("Impar");
        } else {
            System.out.println("Par");
        }

    }
}
