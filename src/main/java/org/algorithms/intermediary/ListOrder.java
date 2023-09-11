package org.algorithms.intermediary;

import java.util.Arrays;
import java.util.Scanner;

public class ListOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int[] arr = {a, b, c, d, e};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
