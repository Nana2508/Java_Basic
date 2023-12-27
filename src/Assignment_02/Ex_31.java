package Assignment_02;

import java.util.Scanner;

public class Ex_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a is ");
        int a = scanner.nextInt();
        System.out.println("Number b is ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i<=b; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of all numbers from a to b is  " + sum);
    }
}
