package br.com.hackerrank.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) {
        try {
            SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");

            SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

            return date24Format.format(date12Format.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
