package Assignment_02;

import java.util.Scanner;

public class Ex_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So nguyen a la ");
        int a = scanner.nextInt();
        System.out.println("So nguyen b la ");
        int b = scanner.nextInt();
        System.out.println("So nguyen c la ");
        int c = scanner.nextInt();
        if (a<=b && b<=c) {
            System.out.println("Increasing");
        } else if (a>=b && b>=c ) {
            System.out.println("Decreasing");
        }
        else {
            System.out.println("neither increasing nor decreasing order");
            
        }
    }
    }

