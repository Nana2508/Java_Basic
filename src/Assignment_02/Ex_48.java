package Assignment_02;

import java.util.Scanner;

public class Ex_48 {
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
        while (true) {
            System.out.println("Nhập phần tử muốn đếm:");
            int numberInput = scanner.nextInt();
            int count = 0;
            for (int number : myNumber) {
                if (numberInput == number) count++;
            }
            System.out.println("Số phần tử " + numberInput + " là: " + count);
        }
    }
}
