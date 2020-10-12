package com.sovliv.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                for (int j = i + 1; j < array.length - 1; j++) {
                    if(array[j] < array[j + 1]) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
