package Assignment_01;

import java.util.Scanner;

public class Exercise_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuoi ky tu s la ");
        String s = scanner.nextLine();
        System.out.println("Thu tu thu k la ");
        int k = scanner.nextInt();
        char result = s.charAt(k-1);
        System.out.println(result);
    }
}
