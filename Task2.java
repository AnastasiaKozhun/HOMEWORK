package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Введите число:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0 && num>0)
            System.out.println("Число четное положительное.");
        else if (num %2 == 0 && num<0)
            System.out.println("Число четное отрицательное.");
        else if (num % 2 == 1 && num < 0)
            System.out.println("Число нечетное отрицательное.");
        else
            System.out.println("Число нечетное положительное.");
    }
}
