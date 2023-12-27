package Assignment_02;

import java.util.Scanner;

public class Ex_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number n is ");
        int n = scanner.nextInt();
        int divisor = 1;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                divisor ++;
                System.out.println(i);
            }
        }
    }
}
