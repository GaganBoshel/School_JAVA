// Exercise 2-Employee information
// Create an employee class with:
// id
// name
// salary
// Create a parameterized constructor to initilize all threee values.
// Create a method displayEmployee() to display the employee information.
// create three employee objects in main().

public class Exercise2 {
	static class Employee {
		int id;
		String name;
		double salary;

		Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		void displayEmployee() {
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Salary: " + salary);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Alice", 50000);
		Employee employee2 = new Employee(2, "Bob", 55000);
		Employee employee3 = new Employee(3, "Charlie", 60000);

		employee1.displayEmployee();
		employee2.displayEmployee();
		employee3.displayEmployee();
	}
}
