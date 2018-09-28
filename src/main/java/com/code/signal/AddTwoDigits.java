package com.code.signal;

public class AddTwoDigits {

    public static void main(String[] args) {
        int n = 29;

        System.out.println(addTwoDigits(n));
    }

    static int addTwoDigits(int n) {
        String[] digits = Integer.toString(n).split("");
        int sum = 0;

        for( String digit : digits){
            sum += Integer.parseInt(digit);
        }

        return sum;
    }
}
