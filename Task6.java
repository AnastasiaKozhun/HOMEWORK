package by.itacademy.hw3;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� ������ ������� ������������:");
        int a = scanner.nextInt();
        System.out.println("������� ����� ������ ������� ������������:");
        int b = scanner.nextInt();
        System.out.println("������� ����� ������� ������� ������������:");
        int c = scanner.nextInt();

        if (a+b>c && a+c>b && b+c>a)
            System.out.println("����������� ����������");
        else
            System.out.println("����� ����������� �� ����� ������������");
    }
}
