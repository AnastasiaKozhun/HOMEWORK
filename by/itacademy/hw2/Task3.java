package by.itacademy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � ��������:");
        int t =scanner.nextInt();

        int w =t / (7*24*3600);
        int d =t % (7*24*3600) /(24*3600);
        int h =t % (7*24*3600)%(24*3600) / 3600;
        int m =t % (7*24*3600)%(24*3600)% 3600 /60;
        int s =t % (7*24*3600)%(24*3600)% 3600 %60;

        System.out.println(s+"���");
        System.out.println(m+"���");
        System.out.println(h+"�");
        System.out.println(d+"����");
        System.out.println(w+"������");
    }
}
