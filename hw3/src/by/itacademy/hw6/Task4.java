package by.itacademy.hw6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuilder rz = new StringBuilder();
        rz.append(String.format("%d + %d = %d\n", a, b, a + b));
        rz.append(String.format("%d - %d = %d\n", a, b, a - b));
        rz.append(String.format("%d * %d = %d\n", a, b, a * b));

        System.out.println(rz);
        System.out.println(rz.toString().replaceAll("=", "равно"));
    }
}