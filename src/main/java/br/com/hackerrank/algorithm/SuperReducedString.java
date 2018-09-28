package br.com.hackerrank.algorithm;

import java.util.Scanner;

public class SuperReducedString {

    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if ((i+2) < sb.length() && (sb.charAt(i) == sb.charAt(i + 1))) {
                sb.delete(i, i+2);
            }
            System.out.println(sb.charAt(i)+" "+sb);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = superReducedString(s);
        System.out.println(result);
    }
}
