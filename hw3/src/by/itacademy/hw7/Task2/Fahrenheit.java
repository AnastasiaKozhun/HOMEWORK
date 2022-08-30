package by.itacademy.hw7.Task2;

    public class Fahrenheit extends Temperatura {
        double fahrenheit;

        Fahrenheit() {
        }

        Fahrenheit(double fahrenheit) {
            this.fahrenheit = fahrenheit;
        }

        @Override
        public double convert(Temperatura to) throws AbsoluteZeroException {
            if (to instanceof Celsius) {
                if (fahrenheit < -459.67) {
                    throw new AbsoluteZeroException("The temperature cannot be less than absolute zero.");
                } else {
                    return ((fahrenheit - 32) * 5) / 9;
                }
            }
            return fahrenheit;
        }
    }
