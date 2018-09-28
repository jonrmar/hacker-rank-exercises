package com.code.signal.arcade.core;

public class PhoneCall {

    static int phoneCall(int min1, int min2_10, int min11, int s) {
        int balance = s - min1;
        int count = 1;
        boolean hasBalance = true;

        for (int i = 0; i < 9 && hasBalance; i++) {
            if (balance >= min2_10){
                balance -= min2_10;
                count++;
            }else {
                hasBalance = false;
            }
        }
        while(hasBalance && balance >= min11){
            balance -= min11;
            count++;
        }
        return count;
    }
}
