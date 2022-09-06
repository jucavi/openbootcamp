package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListSolution5 {

    public static void main(String[] args) {
        ArrayList<String> nombresList = new ArrayList<>();
        nombresList.add("Ana");
        nombresList.add("Laura");
        nombresList.add("Felix");
        nombresList.add("Boris");

        LinkedList<String> nombresLinkedList = new LinkedList<>(nombresList);

        for (String nombres : nombresList) {
            System.out.println(nombres);
        }

        for (String nombres : nombresLinkedList) {
            System.out.println(nombres);
        }
    }
}
