package com.sovliv.job4j.array;

/**
 * Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
 */

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int tmp;
        int position = 0;
        for (int i = 0; i < left.length - 1; i++) {
            for (int j = 0; j < right.length - 1; j++) {
                if(left[i] != right[position]) {
                    position++;

                }
            }
        }
    }
}
