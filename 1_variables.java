class VariablesApp {

	public static String hex(int n) {
    	// call toUpperCase() if that's required
		return String.format("0x%6s", Integer.toHexString(n)).replace(' ', '0');
	}

	public static void main(String[] args) {
		/****************************** Printing Variables *****************************/
		
		// Using Strings
		String foo = "World";
		System.out.println("Hello " + foo);

		// Using numbers
		int minutes = 60;
		System.out.println("1 Hour have " + minutes + " minutes");

		// Using Floating point numbers
		float celcius   = 0;
		double farenheit = 32.0 + celcius*(9.0/5);
		System.out.println(celcius + " Celcius are " + farenheit + " Farenheit grades");

		// Using Double floating point numbers with fixed amount digits of the right
		// Only the first 5 first digits of phi will be showed precision 5
		double phi   = 1.618033988749894848;
		System.out.printf("The golden ratio %.5f\n",phi);

		// Representation Hexadecimal of numbers (hex allow print Hexadecimal)
		int red 	= 0xFF0000;
		int green 	= 0x00FF00;
		int blue	= 0x0000FF;
		System.out.print(
			"Hexadecimal code of:\nRed is: " + hex(red) + 
			"\nGreen is: " + hex(green) + 
			"\nBlue is: " + hex(blue) + "\n");

		/***************************** Operating Variables *****************************/
		
		// Numbers
		int p_foo = 23;
		int p_bar = 19;
		int p_baz = p_foo + p_bar; // Plus
		System.out.println(p_foo + " + " + p_bar + " = " + p_baz);
		
		int m_foo = 69;
		int m_bar = 27;
		int m_baz = m_foo - m_bar; // Minus
		System.out.println(m_foo + " + " + m_bar + " = " + m_baz);

		int mu_foo = 7;
		int mu_bar = 6;
		int mu_baz = mu_foo * mu_bar; // Multiply
		System.out.println(mu_foo + " * " + mu_bar + " = " + mu_baz);

		int d_foo = 420;
		int d_bar = 10;
		int d_baz = d_foo / d_bar; // Divide
		System.out.println(d_foo + " / " + d_bar + " = " + d_baz);

		int mo_foo = 429;
		int mo_bar = 43;
		int mo_baz = mo_foo % mo_bar; // Module
		System.out.println(mo_foo + " mod " + mo_bar + " is " + mo_baz);

		double po_foo = 6.48074069840786;
		int po_bar = 2;
		double po_baz = Math.pow(po_foo, po_bar); // Pow
		System.out.println(po_foo + " to the power of " + po_bar + " is " + po_baz);

		// Strings
		String s_foo = "C++ ";
		String s_bar = s_foo + "Works"; // Concat Strings
		
		// Simple character
		char c_foo = 'T';

		// String Size
		String r_foo = "Lorem ipsum dolor sit amet";
		System.out.println("Size: " + r_foo.length());

		// String replace
		System.out.println(r_foo.replace(" ","_"));

		String a_foo = "Lorem ipsum dolor sit amet";
		System.out.println(a_foo.charAt(0)); // First char on string "Lorem ipsum dolor sit amet"
		System.out.println(a_foo.substring(6,12)); // 6 till 12 chars on string "Lorem ipsum dolor sit amet"
		System.out.println(a_foo.substring(5)); // First 5 chars on string "Lorem ipsum dolor sit amet"
		System.out.println(a_foo.substring(0,6)); // 6 till the end chars on string "Lorem ipsum dolor sit amet"

	}

}