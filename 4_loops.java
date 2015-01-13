class LoopsApp {
	
	public static void main(String[] args) {
		
		// While .. then ..
		System.out.println("While");
		int i = 1;
		while (i < 5) {
			System.out.println(i);
			i++; // i += 1; also works
		}

		// While with function break
		System.out.println("While with break");
		i = 5;
		int result = 1;
		while (true) {
			result *= i;
			if (i <= 1) {
				System.out.println(result);
				break;
			}
			i--; // i -= 1; also works
		}

		// While with continue
		System.out.println("While with continue");
		i = 5;
		result = 1;
		while (true) {
			result *= i;
			if (i > 1) {
				i--;
				continue;	
			}
			System.out.println(result);
			break;
		}

		// do .. while
		System.out.println("Do while");
		i = 5;
		result = 1;
		do {
			result *= i;
			i--;
		} while (i > 1);
		System.out.println(result);

		// For		
		System.out.println("For");
		int x;
		for ( x = 0; x < 5; x++ ) {
			System.out.println(x);
		}

		// For each
		System.out.println("For each");
		Integer numbers[] = { 1,2,3,4,5 };
		for (int v: numbers) {
			System.out.println(v);
		}
		
	}

}