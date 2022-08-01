package by.itacademy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите врем€ в секундах:");
        int t =scanner.nextInt();

        int w =t / (7*24*3600);
        int d =t % (7*24*3600) /(24*3600);
        int h =t % (7*24*3600)%(24*3600) / 3600;
        int m =t % (7*24*3600)%(24*3600)% 3600 /60;
        int s =t % (7*24*3600)%(24*3600)% 3600 %60;

        System.out.println(s+"сек");
        System.out.println(m+"мин");
        System.out.println(h+"ч");
        System.out.println(d+"дней");
        System.out.println(w+"недель");
    }
}
