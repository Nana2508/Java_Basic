package Assignment_02;

import java.util.Scanner;

public class Ex_50 {
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

        boolean bool = true;
        int time = 0;
        while (bool) {
            for (int i = 0; i < myNumber.length - 1; i++) {
                if (myNumber[i] > myNumber[i + 1]) {
                    int temp = myNumber[i];
                    myNumber[i] = myNumber[i + 1];
                    myNumber[i + 1] = temp;
                    time++;
                }
            }
            if (time == 0) {
                bool = false;
            }
            time = 0;
        }

        String output = "Mảng từ nhỏ đến lớn là: ";
        for (int number : myNumber) {
            output = output + number + ", ";
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);
    }
}
