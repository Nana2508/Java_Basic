package Assignment_02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number n: ");
        int n = scanner.nextInt();
        if (n % 2 == 0)
        System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }
}
