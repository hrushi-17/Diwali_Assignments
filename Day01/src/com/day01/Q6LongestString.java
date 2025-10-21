package com.day01;

import java.util.Scanner;

public class Q6LongestString {

    public static int findLongestStringLength(String[] arr) {
        int maxLength = 0;

        for (String s : arr) {
            if (s.length() > maxLength)
                maxLength = s.length();
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int longest = findLongestStringLength(arr);
        System.out.println("Length of the longest string = " + longest);

        sc.close();
    }
}
