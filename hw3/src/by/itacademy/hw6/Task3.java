package by.itacademy.hw6;

public class Task3 {
    public static void main(String[] args){
        String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        String str2 = str.replaceAll("Object-oriented programming","OOP");
        String str3 = str2.replaceFirst("OOP","Object-oriented programming");
        System.out.println(str3);

    }
}
