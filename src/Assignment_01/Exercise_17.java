package Assignment_01;

import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number a is ");
        int a = scanner.nextInt();
        if (a >= 10 && a <= 100) {
            System.out.println(a + " is in the range [10,100]");
        } else {
            System.out.println(a + " is not in the range [10,100]");
        }
    }
}
