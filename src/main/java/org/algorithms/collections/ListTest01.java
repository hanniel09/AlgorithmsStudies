package org.algorithms.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>(16);
        nomes.add("Hanniel");
        nomes.add("Vieira");

        for(String nome: nomes) {
            System.out.println(nome);
        }
        System.out.println("-----------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
