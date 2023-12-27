package Assignment_02;

import java.util.Scanner;

public class Ex_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number n is ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i<=n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
