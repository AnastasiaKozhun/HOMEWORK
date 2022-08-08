package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число от 10 до 999:");
        int a = scn.nextInt();
        int sum = 0;
        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        System.out.println(sum);

        int mult=1;

        while (a > 1) {
            mult = mult * (a % 10);
            a = a / 10;
        }
        System.out.println(mult);
    }
    }

