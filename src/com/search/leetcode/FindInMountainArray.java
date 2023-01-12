package com.search.leetcode;

//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 9, 6, 3, 2, 1};
        int target = 2;
        System.out.println(peekElementInMountainArray(arr, target));
    }

    private static int peekElementInMountainArray(int[] arr, int target) {
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
        int element = orderAgnosticBinarySearch(arr, target, 0, start);
        if (element == -1) {
            element = orderAgnosticBinarySearch(arr, target, start, arr.length - 1);
        }
        return element;
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}