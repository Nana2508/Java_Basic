package Assignment_02;

import java.util.Scanner;

public class Ex_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong phan tu la ");
        int lengthArray = scanner.nextInt();
        int[] myNumber = new int[lengthArray];
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Nhap so thu " + (i + 1) + ":");
            int number = scanner.nextInt();
            myNumber[i] = number;
        }
//        int sum = 0;
//        for (int number : myNumber) {
//            sum = sum + number;
//        }
//        System.out.println("Tong cua tat ca phan tu " + sum);
//    }
        int sum = 0;
        sum = myNumber[0] + myNumber[myNumber.length - 1];
        System.out.println("Tong cua phan tu dau tien va cuoi cung la " + sum);
    }
}

