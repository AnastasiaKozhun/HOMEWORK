package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner reader = new Scanner(System.in);

        System.out.println("enter two numbers");
        num1 =
                reader.nextInt();
        num2 =
                reader.nextInt();
        System.out.println(num1+num2+num1*num2);
    }

    static int sum(int num1, int num2) {
        return num1+num2+num1*num2;
    }
    }
