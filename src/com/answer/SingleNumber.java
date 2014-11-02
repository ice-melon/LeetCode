package com.answer;

/**
 * Created by chiang on 14-11-2.
 */
public class SingleNumber {

    public static int singleNumber(int[] A) {
        int ret = A[0];
        for (int i = 1; i < A.length; i++) {
            ret ^=A[i];
        }
        return ret;
    }
}
