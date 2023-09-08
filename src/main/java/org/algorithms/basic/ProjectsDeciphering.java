package org.algorithms.basic;

public class ProjectsDeciphering {
    public static void main(String[] args) {
        int n = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
