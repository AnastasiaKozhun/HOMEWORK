package by.itacademy.hw4;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
        public static void bubbleSort(int[] arr){
            for(int i = arr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++)

                    if( arr[j] > arr[j+1] ){
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
            }
        }
        public static void insertionSort(int[] arr){
            int[] array = {10, 2, 10, 3, 1, 2, 5};
            System.out.println(Arrays.toString(array));
            for (int left = 0; left < array.length; left++) {
                int value = array[left];
                int i = left - 1;
                for (; i >= 0; i--) {

                    if (value < array[i]) {
                        array[i + 1] = array[i];
                    } else {
                        break;
                    }
                }
                array[i + 1] = value;
            }
            System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] arr){
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(Collections.singletonList(array), left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }
}