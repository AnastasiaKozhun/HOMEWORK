package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 7:");

        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("�����������");
            case 2 -> System.out.println("�������");
            case 3 -> System.out.println("�����");
            case 4 -> System.out.println("�������");
            case 5 -> System.out.println("�������");
            case 6, 7 -> System.out.println("��������");
            default -> System.out.println("������� �����.");
        }
}
}
