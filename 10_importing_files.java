class ImportClassApp {

	public static void main(String[] args) {

		// Use class from other files

		// Person
		Person aux = new Person("Bruce", 28);
		PersonBase aux2 = new Person("Tony", 24);
		
		String name = aux.getName();
		int age = aux.getAge();

		// Hero
		Hero aux3 = new Hero("Batman");
		HeroBase aux4 = new Hero("Batman");

		// Enemy
		Enemy<Person> aux5 = new Enemy("Programmer", aux2);

	}

}