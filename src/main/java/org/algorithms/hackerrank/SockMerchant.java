package org.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Map<Integer, Integer> counts = new HashMap<>();

        for (int number : numbers) {
            counts.put(number, counts.getOrDefault(number, 0) + 1);
        }
        int totalPairs = 0;
        for (int count : counts.values()) {
            totalPairs += count / 2;
        }
        System.out.println(totalPairs);
    }
}
