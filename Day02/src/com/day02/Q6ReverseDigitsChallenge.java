package com.day02;

import java.util.Scanner;

public class Q6ReverseDigitsChallenge {

    public static int reverseDigits(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = reverseDigits(n);
        System.out.println("Reversed digits (ignoring leading zeros) = " + result);
        sc.close();
    }
}
