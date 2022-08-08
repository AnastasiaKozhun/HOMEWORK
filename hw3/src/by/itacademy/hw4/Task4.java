package by.itacademy.hw4;
import java.util.Arrays;
public class Task4 {
    public static void main(String args[]){
        int array[] = new int[]{5, 11, 45, 2, 12, 360};
        int max = getMax(array);
        System.out.println("Максимальное значение массива: "+max);

        int min = getMin(array);
        System.out.println("Минимальное значение массива: "+min);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}