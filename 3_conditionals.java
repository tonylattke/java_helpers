class ConditionalsApp {

	public static void main(String[] args) {
		
		// Commpare Values
		int aux = 23;
		boolean equal 			= aux == 42;
		boolean not_equal 		= aux != 42;

		boolean less_than 		= aux < 42;
		boolean more_than 		= aux > 42;
		boolean less_equal_than	= aux <= 42;
		boolean more_equal_than	= aux >= 42;

		boolean operator_or		= aux < 23 || aux > 42;
		boolean operator_and	= aux < 23 && aux > 42;	
		
		// If .. then .. else ..
		int number = 23;
		if (number == 23) {
			System.out.println("Number is 23");
		} else {
			System.out.println("Number is not 23");
		}

		// If .. then .. else if .. then .. else ..
		String name1 = "Tony";
		String name2 = "Enrique";
		String name  = "Heinrich";
		if (name.equals(name1)) {
			System.out.println("It is Tony");
		} else if (name.equals(name2)) {
			System.out.println("It is Enrique");
		} else {
			System.out.println("It\'s not Tony or Enrique");
		}
		
	}

}