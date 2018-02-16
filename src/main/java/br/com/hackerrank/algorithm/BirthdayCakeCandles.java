package br.com.hackerrank.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int tallest = Arrays.stream(ar).max().orElse(Integer.MIN_VALUE);

        return ((int) Arrays.stream(ar).filter(i -> i == tallest).count());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
