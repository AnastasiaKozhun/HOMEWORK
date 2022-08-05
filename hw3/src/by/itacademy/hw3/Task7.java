package by.itacademy.hw3;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число от 0 до 9:");
        int a = scanner.nextInt();
        { if (a > 9 || a < 0)
            System.out.println("ОШИБКА");}

        System.out.println("Введите второе число от 0 до 9:");
        int b = scanner.nextInt();
        {if (b < 0 || b > 9)
            System.out.println("ОШИБКА");}
        System.out.println("Введите результат умножения первого числа на второе:");
        int m = scanner.nextInt();
        int m1= a*b;
        if (a * b == m)
            System.out.println("Верно!");
        else
            System.out.println("Неверно! Правильный ответ:"+m1+"");

    }
}