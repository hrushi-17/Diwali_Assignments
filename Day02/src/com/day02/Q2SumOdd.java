package com.day02;

import java.util.Scanner;

public class Q2SumOdd {
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (2 * i - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " odd numbers = " + sumOfOddNumbers(n));
        sc.close();
    }
}
