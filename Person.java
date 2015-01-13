public class Person implements PersonBase {

	// Data
	private String name;
	int age; // Default attribute is public in Java

	// Constructors
	Person() {
		name= "Tony";
		age = 24;
	}
	Person(String name, int age) {
		this.name= name;
		this.age = age;
	}

	// Get
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	// Set
	public void setName(String v){
		name = v;
	}
	public void setAge(int v) {
		age = v;
	}

	public void hello(){
		System.out.println("Hello " + name);
	}

}