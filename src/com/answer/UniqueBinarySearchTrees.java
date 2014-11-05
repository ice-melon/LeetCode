package com.answer;

/**
 * Created by chiang on 14-11-2.
 */
public class UniqueBinarySearchTrees {
    // time O(n^2)
    // space O(n)
    public static int numTrees(int n ) {
        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                array[i] = array[i] + array[j] * array[i-1-j];
            }
        }
        return array[n];

    }
}
