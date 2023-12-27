package Assignment_01;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
//        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Value of a: ");
            int a = scanner.nextInt();
            System.out.println("Value of b: ");
            int b = scanner.nextInt();
            int remainder = a % b;
            System.out.println("P :" + remainder);
        }
    }

