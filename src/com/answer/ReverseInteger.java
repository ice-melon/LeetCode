package com.answer;

/**
 * Created by chiang on 14-11-2.
 */
public class ReverseInteger {
    public static int reverse(int x){
        int num = Math.abs(x);
        int ret = 0;
        while (num != 0) {
            int lastDigit = num - num / 10 * 10;
            ret = ret * 10 + lastDigit;
            num = num / 10;
        }
        if (x > 0)
            return ret;
        else
            return -ret;
    }
}
