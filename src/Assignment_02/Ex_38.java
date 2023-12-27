package Assignment_02;

import java.util.Scanner;

public class Ex_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a is ");
        int a = scanner.nextInt();
        System.out.println("Number b is ");
        int b = scanner.nextInt();
        int i = 1;
        int tempResult = a;
        while (i < b) {
            tempResult = tempResult * a;
            i++;
        }
        System.out.println(tempResult);

    }
}
