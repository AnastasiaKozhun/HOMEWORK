package by.itacademy.hw6;

public class Task7 {
    public static void main(String args[]) {

        String str = "2345672.6492634";
        Double d = Double.valueOf("23456.876543");

        double str1 = Double.parseDouble(str);
        System.out.println(str1);

        int intVal = d.intValue();
        System.out.println("Int is " + intVal);
        byte byteVal = d.byteValue();
        System.out.println("Byte is " + byteVal);
        short shortVal = d.shortValue();
        System.out.println("Short is " + shortVal);
        float floatVal = d.floatValue();
        System.out.println("Float is " + floatVal);

        String strd = Double.toString(str1);

        System.out.println("Double is " + strd);
    }
}
