package by.itacademy.hw3;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("������� ����� �� 0 �� 59:");
        int m = scanner.nextInt();{
            if (m>= 60 || m<= 0)
                System.out.println("������");}

        if (m>= 0 && m<= 14)
            System.out.println("������ ��������.");
        else if (m>= 15 && m<= 29)
            System.out.println("������ ��������.");
        else if(m>= 30 && m<= 44)
            System.out.println("������ ��������.");
        else if(m>= 45 && m<= 59)
            System.out.println("��������� ��������.");
    }
}
