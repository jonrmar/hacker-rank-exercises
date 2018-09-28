package com.code.signal.arcade.core;

public class LateRide {

    private int lateRide(int n) {
        String hours = String.valueOf(n/60);
        String minutes = String.valueOf(n%60);
        Integer sum = 0;
        String[] hourDigits = hours.split("");
        for(String digit: hourDigits){
            sum += Integer.parseInt(digit);
        }
        String[] minDigits = minutes.split("");
        for(String digit: minDigits){
            sum += Integer.parseInt(digit);
        }

        return sum;
    }
}
