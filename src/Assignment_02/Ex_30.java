package Assignment_02;

import java.util.Scanner;

public class Ex_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number n is ");
        int n = scanner.nextInt();
        for (int i = -n; i <= n; i++){
            System.out.println(-i);
        }
    }
}
