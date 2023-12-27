package Assignment_02;

import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a is ");
        int a = scanner.nextInt();
        System.out.println("Number b is ");
        int b = scanner.nextInt();
        if (a != 0 && b != 0) {
            System.out.println("a is not equal to 0 and b is not equal to 0");
        } else {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
    }
}

