/**
 * 
 */
package MapInStreams;

import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Siva Shankar
 * @since 16-Oct-2026
 */

public class SortNumbersDescendingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(5, 2, 8, 1, 3);	
		numbers = numbers.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("SortNumbersDescendingOrder:: "+numbers);
	}

}
