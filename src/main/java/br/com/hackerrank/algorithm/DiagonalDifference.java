package br.com.hackerrank.algorithm;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer N = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[N][N];

        for(int i =0; i < N; i++) {
            String[] line = scanner.nextLine().split(" ");

            for (int j = 0; j < N; j++) array[i][j] = Integer.parseInt(line[j]);
        }

        System.out.println(absolutDifference(array, N));
    }

    private static Integer absolutDifference(int[][] array, int N){
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for(int i = 0, j = N-1; i < N; i++, j--){
            sumFirstDiagonal += array[i][i];
            sumSecondDiagonal += array[i][N-1-i];
        }

        return Math.abs(sumFirstDiagonal - sumSecondDiagonal);
    }
}
