package com.search.linear;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };

        System.out.println(Arrays.toString(searchElementInGivenArray(11, array)));
    }

    //Return index if found else [-1,-1]
    private static int[] searchElementInGivenArray(int element, int[][] array) {
        if (array.length < 0) return new int[]{-1, -1};

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c] == element) return new int[]{r, c};
            }
        }

        return new int[]{-1, -1};
    }
}
