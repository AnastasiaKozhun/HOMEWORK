package by.itacademy.hw3;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����:");
        int f = scanner.nextInt();
        System.out.println("������� ������ �����:");
        int s = scanner.nextInt();
        System.out.println("������� ������ �����:");
        int t = scanner.nextInt();

        if (f < s & f < t) {
            if (s < t)
                System.out.println("����� �� �����������: "+f+", "+s+", "+t+"");
            else
                System.out.println("����� �� �����������: "+f+", "+t+", "+s+"");
        }
        if (s < f & s < t) {
            if (f < t)
                System.out.println("����� �� �����������: "+s+", "+f+", "+t+"");
            else
                System.out.println("����� �� �����������: "+s+", "+t+", "+f+"");
        }
        if (t < f & t < s) {
            if (f < s)
                System.out.println("����� �� �����������: "+t+", "+f+", "+s+"");
            else
                System.out.println("����� �� �����������: "+t+", "+s+", "+f+"");
        }
    }
}