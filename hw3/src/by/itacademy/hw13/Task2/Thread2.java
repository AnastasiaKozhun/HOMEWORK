package by.itacademy.hw13.Task2;

public class Thread2 {
    public static void main(String[] args) {

        int[] AI = {7, 3, 5, 9, -1};

        ThreadMinMax t1 = new ThreadMinMax(AI);
        ThreadMinMax t2 = new ThreadMinMax(AI);

        try {
            t1.getThread().join();
            t2.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Error.");
        }

        System.out.println("max = " + t1.getMax());
        System.out.println("min = " + t1.getMin());
    }
}
