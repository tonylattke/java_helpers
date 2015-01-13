public class Hero extends HeroBase{

	// Constructors
	Hero() {
		name= "Tony";
	}
	Hero(String name) {
		this.name= name;
	}

	// Get
	public String getName() {
		return name;
	}

}