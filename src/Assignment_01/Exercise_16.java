package Assignment_01;

import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Letter is ");
            char letter = scanner.next().charAt(0);
            System.out.println("Next letter is " + letter);
            for (int i = 1; i <= 1; i++) {
                System.out.println(++letter);
            }
        }
    }
}
