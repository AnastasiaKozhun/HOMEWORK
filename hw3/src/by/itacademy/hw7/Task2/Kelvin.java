package by.itacademy.hw7.Task2;
     public class Kelvin extends Temperatura {
        double kelvin;

        Kelvin() {
        }

        Kelvin (double kelvin) {
            this.kelvin = kelvin;
        }

        @Override
        public double convert(Temperatura to) {
            if (to instanceof Celsius) {
                return (kelvin- 273.15);
            }
            return kelvin;
        }
}
