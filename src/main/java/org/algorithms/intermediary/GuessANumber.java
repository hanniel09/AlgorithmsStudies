package org.algorithms.intermediary;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 1;
        int max = 50;
        int number = in.nextInt();

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        if(number == random_int){
            System.out.println("congratulations this is the number: " + random_int);
        } else {
            System.out.println("Number incorrect");
        }
    }
}
