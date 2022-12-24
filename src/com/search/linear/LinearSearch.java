package com.search.linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {22, 8, 4, 55, 1, -8, 9, 4, 56, 2, 21, 99, 3};
        System.out.println(searchNumberInArray(42, array));
        System.out.println(searchAndReturnValueIfFound(-88, array));
        System.out.println(searchCharacterInGivenName('i',"my name is don"));
        System.out.println(searchElementInGivenCharArray('l', "harshal".toCharArray()));
    }

    //Search given element in array if found return index else -1
    public static int searchNumberInArray(int element, int[] array) {
        if (array.length < 1) {
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return index;
            }
        }
        return -1;
    }

    //Search element in array if found return value else -1
    public static int searchAndReturnValueIfFound(int element, int[] array) {
        if (array.length < 1) return -1;
        for (int item : array) {
            if (item == element) return item;
        }
        return -1;
    }

    //Search given character in string
    public static int searchCharacterInGivenName(char element, String name) {
        if(name.length() < 1){
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == element) return i;
        }

        return -1;
    }

    public static int searchElementInGivenCharArray(char element, char[] array) {
        if(array.length < 1){
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == element) return i;
        }
        return -1;
    }


}
