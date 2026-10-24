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

public class ConvertNamesToUppercase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("ravi", "arun", "alice");
		names = names.stream().map(String::toUpperCase).toList();
		System.out.println("ConvertNamesToUppercase:: "+ names);
	}

}
