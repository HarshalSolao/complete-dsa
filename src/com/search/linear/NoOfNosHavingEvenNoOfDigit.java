package com.search.linear;

public class NoOfNosHavingEvenNoOfDigit {
    public static void main(String[] args) {
        int[] array = {22, 89, 4, 55, 1, 88, 9, 4, 56, 2, 91, -898996, 3};
        System.out.println(evenNoOfDigit(array));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    private static int evenNoOfDigit(int[] array) {
        int count = 0;
        for (int item : array) {
            if(item < 0){
                item = item * -1;
            }
            if (digit2(item) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Find number of Digit in given number
    private static int digit(int item) {
        int count = 0;
        while (item > 0) {
            count++;
            item = item / 10;
        }
        return count;
    }

    //Optimum way to count no of digit
    private static int digit2(int item){
        return (int)(Math.log10(item))+1;
    }
}
