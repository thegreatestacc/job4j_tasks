package com.sovliv.job4j.condition;

/**
 * Ладья - это шахматная фигура, которая осуществляет ход по доске только по прямой линии в любом направлении.
 * Метод принимает две строки, каждая из которых означает координаты клетки в которой находятся ладьи разного
 * цвета. Необходимо определить может ли одна ладья побить другую. Для этого нужно определить стоят ли они на
 * одной линии или нет.
 * 1. Если совпадает первый символ у двух клеток - значит ладьи стоят на одной линии
 * - метод должен вернуть true (первый символ - это буква столбца, где стоит фигура);
 * 2. Если совпадает второй символ у двух клеток - значит ладьи стоят на одной линии
 * - метод должен вернуть true (второй символ - это цифра строки, где стоит фигура);
 * Во всех остальных случаях метод должен вернуть false.
 */

public class AttackRook {
    public static boolean check(String left, String right) {
        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();
        for (int i = 0; i < leftChars.length; i++) {
            for (int j = 0; j < rightChars.length; j++) {
                if(leftChars[i] == rightChars[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
