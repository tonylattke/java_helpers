public class Enemy<T> {

	// T is generic
	
	public String hability;
	public T character;

	public Enemy(String a, T b) {
		hability 	= a;
		character 	= b;
	}

}