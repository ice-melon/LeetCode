package com.answer;

/**
 * Created by chiang on 14/11/6.
 */
public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] A, int target) {
        int first = 0;
        int last = A.length - 1;

        while (first != (last + 1)) {
            int mid = (first + last) / 2;
            if(A[mid] == target){
                return true;
            }else if (A[first] < A[mid]) {
                if (A[first] <= target && target < A[mid])
                    last = mid;
                else
                    first = mid + 1;
            }else if (A[first] > A[mid]){
                if (A[mid] < target && target <= A[last])
                    first = mid + 1;
                else
                    last = mid;
            }else {
                first = first + 1;
            }
        }
        return false;
    }
}
