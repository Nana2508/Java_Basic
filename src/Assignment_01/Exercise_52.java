package Assignment_01;

import java.util.Scanner;

public class Exercise_52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu s: ");
        String s = scanner.nextLine();
        System.out.println("Ky tu c la ");
        String c = scanner.nextLine();
        char someChar = 'c';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println("the occurrences of character c in s is " + count);
    }
}



