package com.day01;

import java.util.Scanner;

public class Q2PrimeSeries {

    public static void printPrimeSeries(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Generate primes up to: ");
        int n = sc.nextInt();
        printPrimeSeries(n);
        sc.close();
    }
}
