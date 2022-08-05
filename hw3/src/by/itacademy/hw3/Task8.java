package by.itacademy.hw3;

public class Task8 {
    public static void main(String[] args) {

        final int SEC_v_MIN = 60;
        final int MIN_v_HOUR = 60;
        final int TOTAL_SEC = 28800;

        int sec = (int) (Math.random() * TOTAL_SEC);
        int hour = (sec / SEC_v_MIN) / MIN_v_HOUR;

        System.out.println(sec);

        if (hour == 0)
            System.out.println("Осталось менее часа");
        else if (hour == 1)
            System.out.println("Остался " + hour + " час");
        else if (hour >= 2 && hour <= 4)
            System.out.println("Осталось " + hour + " часа");
        else
            System.out.println("Осталось " + hour + " часов");
    }
}