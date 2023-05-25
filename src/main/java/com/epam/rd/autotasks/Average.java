package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int total = 0;
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            count++;
            total += num;
        }

        scanner.close();

        int average;
        if (count == 0) {
            average = 0;
        } else {
            average = total / count;
        }

        System.out.println(average);
    }
}