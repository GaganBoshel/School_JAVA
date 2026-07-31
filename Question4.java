// Find the smallest of three numbers.
public class Question4 {
     public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;
        int num3 = 15;

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " is the smallest number.");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is the smallest number.");
        } else {
            System.out.println(num3 + " is the smallest number.");
        }
    }
}
