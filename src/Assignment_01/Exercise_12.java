package Assignment_01;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Value of b: ");
        int b = scanner.nextInt();
        System.out.println("Before swapping: a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Before swapping: a = " + a + " b = " + b);
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}
