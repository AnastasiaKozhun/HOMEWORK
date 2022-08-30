package by.itacademy.hw7.Task1;

public class Aspirant extends Student{

    public Aspirant(String firstName, String lastName, String group, String course, double averageMark, String scientificWork) {
        super(firstName, lastName, group, course, averageMark);
    }

    @Override
    public double getScholarship() {
        return averageMark ==5 ? 200 : 180;
    }
}
