package Assignment_02;

import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The score of the student is ");
        int score = scanner.nextInt();
        if (score >=0 && score <=10) {
            System.out.println("The score is valid");}
        else {
            System.out.println("The score is not valid");
        }
    }
}
