package com.search.leetcode;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeekIndexInMountainArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 4, 3, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(array));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
