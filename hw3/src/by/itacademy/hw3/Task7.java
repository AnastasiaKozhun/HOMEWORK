package by.itacademy.hw3;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ������ ����� �� 0 �� 9:");
        int a = scanner.nextInt();
        { if (a > 9 || a < 0)
            System.out.println("������");}

        System.out.println("������� ������ ����� �� 0 �� 9:");
        int b = scanner.nextInt();
        {if (b < 0 || b > 9)
            System.out.println("������");}
        System.out.println("������� ��������� ��������� ������� ����� �� ������:");
        int m = scanner.nextInt();
        int m1= a*b;
        if (a * b == m)
            System.out.println("�����!");
        else
            System.out.println("�������! ���������� �����:"+m1+"");

    }
}