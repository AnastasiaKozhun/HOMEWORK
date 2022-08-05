package by.itacademy.hw3;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число от 0 до 59:");
        int m = scanner.nextInt();{
            if (m>= 60 || m<= 0)
                System.out.println("ОШИБКА");}

        if (m>= 0 && m<= 14)
            System.out.println("Первая четверть.");
        else if (m>= 15 && m<= 29)
            System.out.println("Вторая четверть.");
        else if(m>= 30 && m<= 44)
            System.out.println("Третья четверть.");
        else if(m>= 45 && m<= 59)
            System.out.println("Четвертая четверть.");
    }
}
