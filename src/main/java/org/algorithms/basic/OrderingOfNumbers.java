package org.algorithms.basic;

import java.util.Arrays;
import java.util.Scanner;

public class OrderingOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int[] arr = new int[]{num1, num2, num3};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
