// Check whether a year is a leap year.
public class Question6 {
    public static void main(String[] args) {
        int year = 2024; // Change the year as needed

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}
