package com.day04;

import java.util.Scanner;

public class Q6MissingNumberChallenge {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (range 0 to n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " distinct numbers from 0 to " + n + " (one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missing);
        sc.close();
    }
}
