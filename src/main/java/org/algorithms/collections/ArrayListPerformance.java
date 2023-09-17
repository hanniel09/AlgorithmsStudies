package org.algorithms.collections;

import java.util.ArrayList;

public class ArrayListPerformance {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(50);
        numbers.add(10);
        numbers.add(3);
        numbers.add(102);
        numbers.sort((a, b) -> a - b);
        System.out.println(numbers);
    }
}
