package Assignment_02;

import java.util.Scanner;

public class Ex_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm ");
        int lengthArray = scanner.nextInt();
        int[] myNumber = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            int number = scanner.nextInt();
            myNumber[i] = number;
        }
        String output = "Các số >= 0 và <= 10 là: ";
        for (int number : myNumber) {
            if (number >= 0 && number <= 10) {
                output = output + number + ", ";
            }
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);
    }
}
