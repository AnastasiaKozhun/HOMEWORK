package by.itacademy.hw7.Task2;

public class Main {
    public static void main(String[] args) {
        Celsius celsius = new Celsius(36.6);

        System.out.println(celsius.convert(new Fahrenheit()));

        Kelvin kelvin= new Kelvin(309);
        System.out.println(kelvin.convert(new Celsius()));

        Fahrenheit fahrenheit = new Fahrenheit(45);

        try {
            System.out.println(fahrenheit.convert(new Celsius()));
        } catch (AbsoluteZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
