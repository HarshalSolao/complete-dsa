package com.search.linear;

public class MinMaxNumberUsingLinearSearch {

    public static void main(String[] args) {
        int[] array = {22, 8, 4, 55, 1, 88, 9, 4, 56, 2, -21, 99, 3};
        System.out.println("Minimum no : " + minimumNumber(array));
        System.out.println("Maximum no : " + maximumNumber(array));
    }

    private static int maximumNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int item : array) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    private static int minimumNumber(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int item : array) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
}
