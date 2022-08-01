package by.itacademy.hw2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        System.out.println("Введите целое число.");
        Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            if(scn.nextInt()%2==0){
                System.out.println("Число четное.");
            }
            else System.out.println("Число нечетное.");
        }
        else System.out.println("Вы ввели не целое число.");

    }
}
