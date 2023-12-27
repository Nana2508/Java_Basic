package Assignment_02;

public class Ex_44 {
    public static void main(String[] args) {
        int[] myNumber = new int[20];
        for (int i = 0; i < 20; i++) {
            myNumber[i] = i + 1;
        }
        for (int number : myNumber) {
            System.out.println(number);
        }
    }
}