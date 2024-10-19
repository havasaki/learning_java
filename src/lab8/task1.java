package lab8;

import java.util.Scanner;

public class task1 {

    // Рекурсивный метод для проверки, является ли n простым
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false; // Числа <= 1 не простые
        }
        if (divisor * divisor > n) {
            return true; // Если делитель больше sqrt(n), то n простое
        }
        if (n % divisor == 0) {
            return false; // Если n делится на делитель, то оно составное
        }
        // Рекурсивно проверяем следующий делитель
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n > 1: ");
        int n = scanner.nextInt();

        // Запуск проверки с делителем 2
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}