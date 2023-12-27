package Assignment_02;

import java.util.Scanner;

public class Ex_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int lengthArray = sc.nextInt();
        int[] myNumber = new int[lengthArray];
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Nhập số thứ " + (i + 1) + ":");
            int number = sc.nextInt();
            myNumber[i] = number;
        }
        int maxNumber = myNumber[0];
        for (int number : myNumber) {
            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        System.out.println("Số lớn nhất là: " + maxNumber);
    }
}
