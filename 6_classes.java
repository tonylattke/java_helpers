/************************************* Enumeration *************************************/ 

enum Nationality { GERMAN, AMERICAN, VENEZUELAN }

/************************************ Creating Class ***********************************/

// Color
class Color {
	// Attributes by default are public
	int r;
	int g;
	int b;

	public String toString(){
		return "R: " + r + " G: " + g + " B: " + b;
	}
}

// Person
class Person {
	String name;
	int age;

	// Example 1 Constructor - No parameters
	public Person() {
		name= "Tony";
		age = 24;
	}

	// Example 2 Constructor - With parameters
	public Person(String name, int age) {
		this.name= name;
		this.age = age;
	}

	public void hello(){
		System.out.println("Hello " + name);
	}
}

/************************************ Inheritance **************************************/
class Civil extends Person {
	String profesion_name;

	public Civil(String a, int b, String c) {
		name 			= a;
		age				= b;
		profesion_name	= c;
	}
};

class ClassesApp {

	public static void main(String[] args) {

		// Use enumeration
		Nationality aux0 = Nationality.GERMAN;
		// You can also enumeration values of the same class compare

		// Create Color
		Color aux = new Color();
		System.out.println(aux);

		// Change values on class
		aux.r = 150;
		System.out.println(aux);

		// Initialize with own Constructor
		Person aux2 = new Person("Bruce", 28);
		aux2.hello();

		// Change value inside class
		aux2.name = "Tony";
		aux2.hello();

		// Inheritance initialize
		Civil aux3 = new Civil("Heinrich", 24, "Programmer");

		// Use functions of inheritance class
		aux3.hello();
		
	}

}