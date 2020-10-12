package com.sovliv.job4j.condition;

public class BonusCupCoffee {
    /**
     * Метод принимает 2 параметра:
     * 1. Количество чашек кофе, за которые посетитель заплатил;
     * 2. Количество чашек кофе, по достижении которого следующая чашка будет бесплатной.
     * Необходимо реализовать метод таким образом, чтобы он вернул общее количество
     * чашек кофе - оплаченных и бонусных.
     * @param count
     * @param n
     * @return
     */
    public static int countCup(int count, int n) {
        return count + (count / n);
    }
}
