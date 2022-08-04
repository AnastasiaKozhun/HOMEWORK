package by.itacademy.hw3;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника:");
        int a = scanner.nextInt();
        System.out.println("Введите длину второй стороны треугольника:");
        int b = scanner.nextInt();
        System.out.println("Введите длину третьей стороны треугольника:");
        int c = scanner.nextInt();

        if (a+b>c && a+c>b && b+c>a)
            System.out.println("Треугольник существует");
        else
            System.out.println("Такой треугольник не может существовать");
    }
}
