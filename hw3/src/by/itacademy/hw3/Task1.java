package by.itacademy.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main( String [] args) {
        int num;
        System.out.println("������� �����:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if ( num % 2 == 0 )
            System.out.println("����� ������.");
        else
            System.out.println("����� ��������.");
    }
}