package Assignment_01;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        // libarary
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Input first number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Input second number:");
            int secondNumber = scanner.nextInt();
            if (firstNumber > secondNumber) {
                System.out.println("True");
            } else if (firstNumber == secondNumber) {
                System.out.println("First number is equal to Second number");
            } else {
                System.out.println( "False");

            }
            check = false;
        }

    }
}
