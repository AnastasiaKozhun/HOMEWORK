package by.itacademy.hw4;
import java.util.Arrays;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        process(num);
    }
    public static void process(int num) {
        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if ( arr[i] < min)
                min = arr[i];
        if(min% 2==1)
        System.out.println("Минимальный нечетный элемент массива : " + min);
        }
}

