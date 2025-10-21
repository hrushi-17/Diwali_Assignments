package com.day01;

import java.util.Scanner;

public class Q5EvenOdd {

    public static String checkEvenOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + " is " + checkEvenOdd(n));
        sc.close();
    }
}
