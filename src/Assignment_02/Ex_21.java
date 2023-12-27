package Assignment_02;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Person1's name is ");
        String name_01 = scanner.nextLine();
        System.out.println("Person2's name is");
        String name_02 = scanner.nextLine();
        if (name_01.equals(name_02)) {
            System.out.println("Two people have the same name");}
        else {
            System.out.println("Two people don't have the same name");
        }
    }
}
