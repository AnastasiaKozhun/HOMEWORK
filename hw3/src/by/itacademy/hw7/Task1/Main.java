package by.itacademy.hw7.Task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "Group1", "Course1", 4.5);
        Aspirant aspirant = new Aspirant("Александр", "Cоколов",
                "Group2", "Course3", 5, "Work1");
        Student aspirant2 = new Aspirant("Виктория", "Зубко",
                "Group2", "Course3", 4.8, "Work2");

        Student[] students = {student, aspirant, aspirant2};
        for (Student s : students) {
            System.out.println( s.getScholarship());
        }
    }
}
