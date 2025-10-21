package com.day02;

import java.util.Scanner;

public class Q3PalindromeCheck {

    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(n + (isPalindrome(n) ? " is a Palindrome" : " is Not a Palindrome"));
        sc.close();
    }
}
