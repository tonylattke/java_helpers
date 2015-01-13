import java.time.*;
import java.lang.Math;
import java.util.Random;

class LibrariesApp {

	public static void main(String[] args) {

		/************************************ Datetime *********************************/
		
		// Now
		LocalDateTime tm = LocalDateTime.now();
		System.out.println(tm);

		// Now - 2 Hours
		LocalDateTime two_hours = tm.minusHours(2);
		System.out.println(two_hours);
		// We have also minus/plus seconds, minutes, days, months and years functions
		
		/**************************************  Math **************************************/

		// Elemental numbers
		double aux_pi = Math.PI;
		double aux_exp = Math.E;
		double phi = (1 + Math.sqrt(5))/2;

		int x = 10;

		//  It's a number must check

		int res_round = Math.round(x);	// Round x
		
		double res_exp = Math.exp(x); 	// e to the power of 10

		double res_log = Math.log(x); 	// Default base e - log10 for logarithm base 10
		
		double res_sqrt = Math.sqrt(10);

		double res_sin = Math.sin(10);
		double res_cos = Math.cos(10);
		double res_tan = Math.tan(10);

		/************************************** Random *************************************/

		// Random value generator
		Random rand = new Random();

		// Set seed with time value
		rand.setSeed(System.currentTimeMillis());

		System.out.println(rand.nextInt());  // Random int value from Min till Max int value
		System.out.println(rand.nextInt(23));// Random int value from 0 till 22
		
		// Random number betwen 0 and 1
		System.out.println(Math.random());

		Integer lost[] = { 4, 8, 15, 16, 23, 42 };

		// Random member of array
		int value_lost = lost[Math.abs(rand.nextInt() % 6)];

		// Random int on range
		int range = 50;
		int minimum = 100;
		int random_number = Math.abs(rand.nextInt()) % range + minimum;
		System.out.println(random_number);

	}

}