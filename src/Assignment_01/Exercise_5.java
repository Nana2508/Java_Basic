package Assignment_01;

import java.time.LocalDate;

public class Exercise_5 {
    public static void main(String[] args) {
        String name = "AutomationTest";
        System.out.println( "Name: " + name);
        LocalDate dob = LocalDate.ofYearDay(2019, 32);
        System.out.println("Date of birth: " + dob.getYear());
    }
}
