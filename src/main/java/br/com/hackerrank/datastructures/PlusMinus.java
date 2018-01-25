package br.com.hackerrank.datastructures;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int countPositive = 0, countNegative = 0, countZero = 0;
        int n = arr.length;
        for (int number : arr) {

            if (number > 0) countPositive++;
            else if (number == 0) countZero++;
            else countNegative++;
        }

        System.out.println(new BigDecimal((double) countPositive / n).setScale(6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal((double) countNegative / n).setScale(6, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal((double) countZero / n).setScale(6, RoundingMode.HALF_UP));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();


    }
}
