package Assignment_02;

public class Ex_41 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=100) {
            if (i==10) {
                i++;
                continue;
            }
            if (i==20){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
