package com.sovliv.job4j.condition;

/**
 * Метод принимает две строки, на выходе метод должен вернуть булево значение.
 * Метод необходимо реализовать таким образом, чтобы:
 * 1. Если обе строки пустые - метод должен вернуть true.
 * 2. Если первая буква первой строки равна последней букве второй строки
 * и последняя буква первой строки равна первой букве второй строки - метод должен вернуть true.
 * 3. Во всех остальных случаях метод должен вернуть false.
 * Для извлечения символов из строки используйте метод charAt() класса String.
 */

public class PairsCharString {
    public static boolean check(String l, String r) {
        char[] leftChars = l.toCharArray();
        char[] rightChars = r.toCharArray();
        int lengthLeft = leftChars.length;
        int lengthRight = rightChars.length;

        if (l.isEmpty() && r.isEmpty()) {
            return true;
        } else return leftChars[0] == rightChars[lengthRight - 1] && leftChars[lengthLeft - 1] == rightChars[0];
    }
}
