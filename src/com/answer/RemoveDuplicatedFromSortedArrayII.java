package com.answer;

/**
 * Created by chiang on 14-11-4.
 */
public class RemoveDuplicatedFromSortedArrayII {

    public static  int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }

        int t = 1;
        int index = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                A[++index] = A[i];
                t = 1;
            }else {
                if (t < 2) {
                    A[++index] = A[i];
                }
                t++;
            }
        }

        return index+1;
    }

}
