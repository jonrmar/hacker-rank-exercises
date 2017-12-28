package br.com.hackerrank.datastructures;

import java.util.Scanner;
import java.util.regex.Matcher;

public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[6][6];

        for(int i = 0; i <= 5; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < line.length; j++)
                array[i][j] = Integer.parseInt(line[j]);
        }

        hourGlasses(array);
    }

    private static void hourGlasses(int[][] array){
        int size = 6;
        int sum;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + 2) < size && (j + 2) < size) {
                    sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println(max);
    }
}
