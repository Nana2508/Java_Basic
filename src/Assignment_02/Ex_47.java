package Assignment_02;

import java.util.Scanner;

public class Ex_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong phan tu la ");
        int lengthArray = scanner.nextInt();
        int[] myNumber = new int[lengthArray];
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Phan tu thu " + (i + 1) + ":");
            int number = scanner.nextInt();
            myNumber[i] = number;
        }
        String output = "Danh sách số chẵn là: ";
        for (int i : myNumber) {
            if (i % 2 == 0) {
                output = output + i + ", ";
            }
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);
    }
}
