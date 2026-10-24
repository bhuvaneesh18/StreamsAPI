/**
 * 
 */
package FilterMethod;

import java.util.List;

/**
 * 
 * @author Siva Shankar
 * @since 16-Oct-2026
 */

public class FilterNumbersGreaterThan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(5, 12, 8, 20, 15);
		numbers = numbers.stream().filter(n -> n>10).toList();
		System.out.println(numbers);
	}

}
