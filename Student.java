// Question 1 — Student

// Create a Student class with:

// id
// name
// age

// Create the following overloaded constructors:

// Constructor with no arguments
// Constructor with id and name
// Constructor with id, name, and age

// Create three Student objects using the three different constructors and display their information.
public class Student {
	int id;
	String name;
	int age;

	Student() {
		this(0, "", 0);
	}

	Student(int id, String name) {
		this(id, name, 0);
	}

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student(1, "Alice");
		Student student3 = new Student(2, "Bob", 20);

		student1.display();
		student2.display();
		student3.display();
	}
}
