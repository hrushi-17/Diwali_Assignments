package com.day04;

import java.util.Scanner;

public class Q4SumOfDigits {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(n));
        sc.close();
    }
}
