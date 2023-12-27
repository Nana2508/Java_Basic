package Assignment_02;

import java.util.Scanner;

public class Ex_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a is ");
        int a = scanner.nextInt();
        System.out.println("Number b is ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}
