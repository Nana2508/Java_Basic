package Assignment_02;

import java.util.Scanner;

public class Ex_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number a is ");
        int a = scanner.nextInt();
        System.out.println("The number b is ");
        int b = scanner.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (i%3 == 0 && i%5 == 0) {
//                System.out.println(i);
//            }
        int i = a;
        while (i <= b) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
