package by.itacademy.hw7.Task2;

    public class Celsius extends Temperatura {
        double celsius;

        Celsius() {
        }

        Celsius(double celsius) {
            this.celsius = celsius;
        }

        @Override
        public double convert(Temperatura to) {
            if (to instanceof Fahrenheit) {
                return (celsius * 9) / 5 + 32;
            }
            return celsius;
        }
    }
