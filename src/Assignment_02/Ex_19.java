package Assignment_02;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number n is ");
            int n = scanner.nextInt();
            if (n > 0) {
                System.out.println("n is a positive number");
            } else if (n < 0) {
                System.out.println("n is a negative number");
            } else {
                System.out.println("n is equal to 0");
            }
        }
    }
}
