public class Armstrong {
public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(num + (sum == num ? " is " : " is NOT ") + "an Armstrong number.");
    }
}
