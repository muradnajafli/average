package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        if (size < 100) {
            int[] arrays = new int[size];
            int total = 0;
            int avarage = 0;
            for (int i = 0; i < size; i++) {
                arrays[i] = scanner.nextInt();
            }

            if (arrays[size-1] == 0) {
                for (int array: arrays) {
                    total+=array;
                }
                avarage = total / (size-1);
                System.out.println(avarage);


            } else {
                System.out.println("Last element must be 0");
            }
        } else {
            System.out.println("Size of array can have a maximum 100");

        }

    }
}