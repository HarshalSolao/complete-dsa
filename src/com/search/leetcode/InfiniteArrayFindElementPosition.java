package com.search.leetcode;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArrayFindElementPosition {
    public static void main(String[] args) {
        int array[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 190, 200, 210, 220, 240};
        int target = 452;

        System.out.println(findPosition(target, array));
    }

    //As array is infinite array we should not use length
    //And consider chunks to find element
    private static int findPosition(int target, int[] array) {
        int start = 0;
        int end = 1;
        while (target > array[end]) {
            int temp = end + 1; // New start
            // previous end + (sizeOfBox) * 2
            // sizeOfBox = (end - start + 1) i.e. length of box
            end = end + (end - start + 1) * 2;
            start = temp; // Copy new start
        }
        return binarySearch(target, array, start, end);
    }

    private static int binarySearch(int target, int[] array, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
