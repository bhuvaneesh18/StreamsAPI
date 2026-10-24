/**
 * 
 */
package MapInStreams;

import java.util.List;

/**
 * 
 * @author Siva Shankar
 * @since 16-Oct-2026
 */

public class MapDoubleEachNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		int squar =2; 
		numbers = numbers.stream().map(n -> n*squar).toList();
		System.out.println("MapDoubleEachNumber:: "+numbers);
	}

}
