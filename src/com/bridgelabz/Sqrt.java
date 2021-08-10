package com.bridgelabz;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double c = sc.nextDouble();
        double epsilon = 1.0e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("The Square root of a number is " + t);
        sc.close();
    }

}


