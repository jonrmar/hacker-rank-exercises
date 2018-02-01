package br.com.hackerrank.algorithm;

import java.util.Collections;
import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String spaces = String.join("", Collections.nCopies((n - i), " "));
            String hashtags = String.join("", Collections.nCopies(i, "#"));
            System.out.println(spaces + hashtags);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
