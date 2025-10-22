package com.day04;

import java.util.Scanner;

public class Q2MultiplicationTable {

    public static void printTable(int n) {
        System.out.println("Multiplication Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}
