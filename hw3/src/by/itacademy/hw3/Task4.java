package by.itacademy.hw3;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите первое число:");
        int f = scanner.nextInt();
        System.out.println("¬ведите второе число:");
        int s = scanner.nextInt();
        System.out.println("¬ведите третье число:");
        int t = scanner.nextInt();

        if (f < s & f < t) {
            if (s < t)
                System.out.println("„исла по возрастанию: "+f+", "+s+", "+t+"");
            else
                System.out.println("„исла по возрастанию: "+f+", "+t+", "+s+"");
        }
        if (s < f & s < t) {
            if (f < t)
                System.out.println("„исла по возрастанию: "+s+", "+f+", "+t+"");
            else
                System.out.println("„исла по возрастанию: "+s+", "+t+", "+f+"");
        }
        if (t < f & t < s) {
            if (f < s)
                System.out.println("„исла по возрастанию: "+t+", "+f+", "+s+"");
            else
                System.out.println("„исла по возрастанию: "+t+", "+s+", "+f+"");
        }
    }
}