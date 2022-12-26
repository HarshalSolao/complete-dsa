package com.search.binary;

public class CeilingOfGivenNumber {
    public static void main(String[] args) {
        int[] array = {-5,-1, 0, 15, 26};
        int target = 20;
        System.out.println(ceilingNumber(target, array));
    }

    // Ceiling Number = The Smallest number greater than equal to target
    private static int ceilingNumber(int target, int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target){
                end = mid - 1;
            } else {
                return array[mid];
            }
        }

        return array[start];
    }
}
