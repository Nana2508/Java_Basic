package Assignment_01;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("radius" );
        double radius = scanner.nextDouble();
        double circumference= Math.PI * 2*radius;
        System.out.println("The circumference of the circle is: "+circumference);
//    }
//        int radius = 20;
//        double pi = 3.14;
//        double c = pi * radius * 2;
//        System.out.println("The circumference of the circle is: " + c);
    }
}

