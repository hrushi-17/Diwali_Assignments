package com.day01;

import java.util.Scanner;

public class Q1PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + (isPrime(num) ? " is Prime" : " is Not Prime"));
        sc.close();
    }
}
