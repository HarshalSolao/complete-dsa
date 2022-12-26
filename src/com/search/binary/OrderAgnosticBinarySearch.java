package com.search.binary;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] array = {-1, -5, -8, -9, 15, 26, 39, 42, 49, 53, 61, 66, 69, 89, 99, 124, 652};
        int[] array1 = {253, 124, 33, 24, 6, 1, 0, -5, -9, -24};
        int target = 26;
        System.out.println("Result is : " + orderAgnosticBinarySearch(target, array));
    }

    private static int orderAgnosticBinarySearch(int target, int[] array) {
        int start = 0;
        int end = array.length - 1;

        //To find order or sorted array
        boolean isAsc = array[start] < array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (array[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (array[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
