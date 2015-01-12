import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javafx.util.Pair;

class DataStructuresApp {

	public static void main(String[] args) {
		
		/************************************* Pair ************************************/

		Pair<String,String> mytuple = new Pair<String,String>("Bruce","Wayne");

		// Access on pair
		System.out.println("Name: " + mytuple.getKey());
		System.out.println("Family: " + mytuple.getValue());

		// Replace on Pair is not supported

		/*********************************** Arrays ************************************/

		// Empty Array with 3 slots
		Integer empty_array[] = new Integer[3];

		// Insert elements on array
		empty_array[0] = 1;
		empty_array[1] = 2;
		empty_array[2] = 3;

		// Print values on array
		for (int i = 0;i < empty_array.length; i++) {
			System.out.println(empty_array[i]);	
		}		

		// Array loaded
		Integer lost[] = { 4, 8, 15, 16, 23, 42 };

		// Length of array
		System.out.println("Size of array: " + lost.length);

		// Concat
		Integer array1[] = { 1, 2, 3 };
		Integer array2[] = { 4, 5, 6, 7, 8, 9, 10 };
		int size1 = array1.length;
		int size2 = array2.length;
		Integer array_total[] = new Integer[size1 + size2];
		System.arraycopy(array1, 0, array_total, 0, size1);
		System.arraycopy(array2, 0, array_total, size1, size2);

		// Access to diferents elements
		Integer squares[] = { 1, 4, 9, 16, 36 };
		int a = squares[0];
		
		// Change value of element on array
		squares[4] =25;

		// Array inside array
		Integer[] array3[] = { array1, array2 };

		// Delete array
		array1 = null;

		/************************************* List ************************************/
		
		// Empty list
		List<Integer> empty_list = new ArrayList<Integer>();

		// Append elements to the list
		empty_list.add(1);
		empty_list.add(2);
		empty_list.add(3);

		// Print values on list
		System.out.println(empty_list);

		// Delete the last element
		empty_list.remove(empty_list.size() - 1);

		// Delete the first element
		empty_list.remove(0);

		// List loaded 
		Integer numbers[] = { 4, 8, 15, 16, 23, 42 };
		List<Integer> numbers1 = Arrays.asList(numbers);

		// Length of list
		System.out.println("Size of list: " + empty_list.size());

		// Concat lists
		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.addAll(numbers1);

		// Sort list
		Collections.sort(numbers2);

		// Delete list
		for (int j=0; j < numbers2.size(); j++) {
			numbers2.remove(j);
		}
		numbers2 = null;

		/************************************* Map *************************************/

		// Empty dictionary
		Map<String, String> dictionary = new HashMap<String, String>();

		// Add elements
		dictionary.put("a","Alice");
		dictionary.put("e","Erick");
		dictionary.put("i","Isaac");
		dictionary.put("o","Oscar");
		dictionary.put("u","Ursula");

		// Access
		System.out.println(dictionary.get("i"));

		// Replace value
		dictionary.put("o","Oriana");

		// Erase element
		dictionary.remove("u");

		// Size
		System.out.println(dictionary.size());

		/********************************* Arithmetic Conversions **************************/

		double normal_double;
		float normal_float;		
		long long_i;
		int in;
	}

}