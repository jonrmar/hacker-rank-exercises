package br.com.hackerrank.algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BirthdayChocolate {

    static int solve(int[] s, int d, int m) {
        int count = 0;
        int sum, index;

        for(int i = 0; i< s.length; i++){
            sum = s[i];

            index = 1;
            for(int j= i+1; index < m && j < s.length; j++, index++ ){
                sum += s[j];
            }

            if(sum == d) count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] s = new int[n];

        String[] sItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s[i] = sItem;
        }

        String[] dm = scanner.nextLine().split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = solve(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
