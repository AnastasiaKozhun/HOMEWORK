package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число от 1 до 7:");

        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6, 7 -> System.out.println("Выходной");
            default -> System.out.println("Нверное число.");
        }
}
}
