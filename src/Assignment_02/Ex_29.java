package Assignment_02;

import java.util.Scanner;

public class Ex_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a is ");
        int a = scanner.nextInt();
        System.out.println("Number b is ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
