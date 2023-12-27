package Assignment_02;

import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number a is ");
        int a = scanner.nextInt();
        System.out.println("The number b is ");
        int b = scanner.nextInt();
        if ( a >= b) {
            System.out.println("a is greater than or equal to b");}
        else {
            System.out.println("a is smaller than  b");
        }
    }
}
