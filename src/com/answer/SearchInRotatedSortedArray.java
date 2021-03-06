package com.answer;

/**
 * Created by chiang on 14-11-5.
 */
public class SearchInRotatedSortedArray {
    public static int search(int[] A, int target) {
        int first = 0;
        int last = A.length - 1;

        while (first != (last + 1)) {
            int mid = (first + last) / 2;
            if(A[mid] == target){
                return mid;
            }else if (A[first] <= A[mid]) {
                if (A[first] <= target && target < A[mid])
                    last = mid;
                else
                    first = mid + 1;
            }else {
                if (A[mid] < target && target <= A[last])
                    first = mid + 1;
                else
                    last = mid;
            }
        }
        return -1;
    }
}
