import java.util.Scanner;


public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            double sal = sc.nextDouble();
            double bonus = sal < 20000 ? sal * 0.20 :
                           sal <= 39999 ? sal * 0.15 :
                           sal <= 59999 ? sal * 0.10 : sal * 0.05;
            System.out.println("Salary: " + sal + ", Bonus: " + bonus + ", Total: " + (sal + bonus));
        }
    }
}
