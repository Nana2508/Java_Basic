package Assignment_01;

public class exercise_15 {
    public static void main(String[] args) {
        String s = "cucumber";
        char someChar = 'c';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println("the occurrences of character c in s is " + count);
    }
}
