package com.day02;

import java.util.Scanner;

public class Q4ArmstrongCheck {

    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(n + (isArmstrong(n) ? " is an Armstrong number" : " is Not an Armstrong number"));
        sc.close();
    }
}
