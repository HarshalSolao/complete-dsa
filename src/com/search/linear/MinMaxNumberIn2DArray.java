package com.search.linear;

public class MinMaxNumberIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {11, 2, 3},
                {4, 275, 6, -7},
                {-8, 99, 10, 11, 112}
        };

        System.out.println("Minimum is : "+minimumNumber(array));
        System.out.println("Maximum is : "+maximumNumber(array));
    }

    private static int maximumNumber(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (max < array[row][col]){
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    private static int minimumNumber(int[][] array) {
        int min = Integer.MAX_VALUE;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(min > array[row][col]){
                    min = array[row][col];
                }
            }
        }
        return min;
    }
}
