package com.search.leetcode;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'd', 'e', 'h', 'x', 'y'};
        char target = 'g';
        System.out.println(ceilingValue(target, letters));
    }

    private static char ceilingValue(char target, char[] letters) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }
}
