package by.itacademy.hw7.Task1;

public class Student {
        String firstName;
        String lastName;
        String group;
        String course;
        double averageMark;

        public Student(String firstName,String lastName, String group, String course, double averageMark ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.course = course;
            this.averageMark = averageMark;
        }

       public double getScholarship() {
            return averageMark ==5 ? 100 : 80;
       }

}

