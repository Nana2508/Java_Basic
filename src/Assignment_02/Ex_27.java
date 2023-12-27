package Assignment_02;

import java.util.Scanner;

public class Ex_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number x is ");
        int x = scanner.nextInt();
        System.out.println("Number y is ");
        int y = scanner.nextInt();
        if (x>0 && y>0) {
            System.out.println("First Quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Second Quadrant");
        } else if (x<0 && y<0) {
            System.out.println("Third Quadrant");
        } else if (x>0 && y<0) {
            System.out.println("Fourth Quadrant");
        } else if (x==0 && y==0) {
            System.out.println("Origin");
        } else if (x!=0 && y==0) {
            System.out.println("x-asis");
        }
        else {
            System.out.println("y-asis");
        }
        }

    }

