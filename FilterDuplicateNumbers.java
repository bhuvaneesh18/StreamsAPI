/**
 * 
 */
package FilterMethod;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @author Siva Shankar
 * @since 16-Oct-2026
 */

public class FilterDuplicateNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers =List.of(1, 2, 3, 2, 4, 1, 5);
		Set<Integer> dublicate = new HashSet<Integer>();
		Set<Integer> dublicate1 = new HashSet<Integer>();
		dublicate1 = numbers.stream().filter(n -> !dublicate.add(n)).collect(Collectors.toSet());
		System.out.println("FilterDuplicateNumbers::" + dublicate1);
	}

}
