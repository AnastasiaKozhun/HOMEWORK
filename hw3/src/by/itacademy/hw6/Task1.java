package by.itacademy.hw6;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        String str = c.nextLine();

        String str2 = str.replaceAll("\\s+"," ");
        System.out.println( str2);
    }
}
