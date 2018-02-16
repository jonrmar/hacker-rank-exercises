package br.com.hackerrank.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        Long sum;
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;

        for (int anArr : arr) {
            sum = Arrays.stream(arr).mapToLong(elem -> elem).sum() - anArr;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }

        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
