package Ejercicio_4;

public class sumDigits {
    public static int sumDigits(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + sumDigits(number / 10);
        }
    }
}