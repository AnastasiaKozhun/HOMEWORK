package by.itacademy.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args){
        String j ="Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";
        Matcher m = Pattern.compile("(?=(Java))").matcher(j);
        List<Integer> pos = new ArrayList<>();
        while (m.find())
        {
            pos.add(m.start());
        }
        System.out.println(pos);
    }
}
