package br.com.hackerrank.algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {

        int highestScore = scores[0];
        int countHighest = 0, countLowest = 0;
        int lowestScore = scores[0];

        for(int score: scores){
            if(score > highestScore){
                highestScore = score;
                countHighest ++;
            }
            if(score < lowestScore){
                lowestScore = score;
                countLowest++;
            }
        }

        int[] countScore = {countHighest, countLowest};
        return countScore;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] score = new int[n];

        String[] scoreItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoreItem = Integer.parseInt(scoreItems[i]);
            score[i] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));

            System.out.println(result[i]);
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }

        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
