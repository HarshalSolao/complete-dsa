package com.search.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-1, -5, -8, -9, 15, 26, 39, 42, 49, 53, 61, 66, 69, 89, 99, 124, 652};
        int target = 124;
        System.out.println("Result is : " + binarySearch(target, array));
    }

    private static int binarySearch(int target, int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
