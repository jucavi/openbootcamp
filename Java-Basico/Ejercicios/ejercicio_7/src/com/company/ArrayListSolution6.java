package com.company;

import java.util.ArrayList;

public class ArrayListSolution6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            list.add(i);
        }

        for (int i: list) {
            System.out.println(i);
        }

    }
}
