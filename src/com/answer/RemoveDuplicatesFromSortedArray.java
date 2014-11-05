package com.answer;

/**
 * Created by chiang on 14-11-2.
 */
public class RemoveDuplicatesFromSortedArray {
    public static  int removeDuplicates(int[] A) {
        if (A.length <= 1)
            return A.length;
        int index = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[index] != A[i])
                A[++index] = A[i];
        }
        return index + 1;

    }
}
