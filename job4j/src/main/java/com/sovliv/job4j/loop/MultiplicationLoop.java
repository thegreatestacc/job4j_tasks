package com.sovliv.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int result = 0;
            for (int i = a; i <= b; i++) {
                if (a == 0 || b == 0) {
                    return 0;
                }
                result = i * b;
                break;
            }
        return result;
    }
}
