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

public class FilterNamesStartingWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> str = List.of("Tamil","BhuvanT","BT");
    str=  str.stream().filter(n -> n.contains("a")).toList();
           System.out.println("FilterNamesStartingWith:: "+str);
	}

}