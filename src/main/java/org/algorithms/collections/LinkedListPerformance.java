package org.algorithms.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPerformance {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        numbers.add(23);
        numbers.add(21);
        numbers.add(22);
        numbers.sort((a, b) -> a - b);
        System.out.println(numbers);

    }
}
