package by.itacademy.hw4;

public class Task1 {
    public static void main(String[] args) throws Exception {
            int i = 1;
            while (i <= 10) {
                int j = 1;
                while (j <= 10) {
                    System.out.print(i * j + " ");
                    j++;
                }
                System.out.println("\n");
                i++;
            }
        }
    }
