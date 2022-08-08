package by.itacademy.hw4;

import java.util.Arrays;

public class Task7 {
    public static void main(String args[]) {
        int[] array = new int[5];
        for (int i =0; i<array.length-1; i++){
            array[i] = (int)(Math.random()*10);
        }
        for (int k : array) {
            System.out.println(k);
        }

        int rounds = array.length /2;
        for (int r=0;r<rounds;r++)
        {int temp = array[r];
            array[r] = array[5-1-r];
            array[5-1-r] = temp;
        }
        System.out.println("Перевернуть");
        for (int j : array) {
            System.out.println(j);
        }

    }
}
