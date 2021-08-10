package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n, first = 0, next = 1;
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        for (int i = 1; i <= n - 2; ++i) {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
        }

    }

}