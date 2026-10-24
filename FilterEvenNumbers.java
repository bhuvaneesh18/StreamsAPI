/**
 * 
 */
package FilterMethod;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Siva Shankar
 * @since 16-Oct-2026
 */

public class FilterEvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers =Arrays.asList(10, 15, 20, 25, 30);
		numbers = numbers.stream().filter(n -> n%2==0).toList();
		System.out.println(numbers);
	}

}
