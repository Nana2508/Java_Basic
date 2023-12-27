package Assignment_02;

import java.util.Scanner;

public class Ex_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number n is ");
        int n = scanner.nextInt();
        for (int i = n; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println("List of even number from n to 100 is " + i);
            }
        }
    }
}
