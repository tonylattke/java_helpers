class FunctionsApp {

	/***************************** Example 1 - Create a function ***********************/

	// Even or not
	// @number : Number to decide
	// @return : True if the number is even, otherwise False	
	public static boolean even(int number){
		return number % 2 == 0;
	}

	/********************************* Example 2 - Recursion ***************************/

	// Factorial of number
	// @number : Number
	// @return : Factorial value of number
	public static int factorial(int value){
		if (value <= 1)
			return 1;
		return value * factorial(value -1);
	}

	// Fibonacci
	// @value : Number
	// @return : Fibonacci value
	public static int fibonacci(int value){
		if (value == 0) {
			return 0;
		} else if (value == 1) {
			return 1;
		}
		return fibonacci(value-1)+fibonacci(value-2);
	}

	/***************************** Example 3 - Method Function *************************/

	public static void hello(){
		System.out.println("Hello");
	}

	/************************************ Function Main ********************************/

	public static void main(String[] args) {
		
		// Testing Function even
		for (int j = 0; j < 10; ++j) {
			if (even(j)) {
				System.out.println(j + " - Even");
			} else {
				System.out.println(j + " - Odd");
			}
		}

		// Testing Function factorial and fibonacci
		int number = 7;
		System.out.println("Factorial of " + number + " is " + factorial(number));
		System.out.println("Fibonacci of " + number + " is " + fibonacci(number));

		// Testing hello
		hello();
				
	}

}