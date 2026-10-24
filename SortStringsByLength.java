package MapInStreams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Siva Shankar
 * @since 17-Oct-2026
 */

public class SortStringsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names = List.of("Bhuvan", "Ram", "Ravi", "Arun");
//		names = names.stream().sorted((a,b) -> Integer.compare(a.length(), b.length())).toList();
//	System.out.println("SortStringsByLength:: "+names);
//	
	
	
	List<String> names1 =List.of("Bhuvan", "Ram", "Ravi", "Arun");
    Map<String, Integer> result = names1.stream().sorted((a, b) ->Integer.compare(a.length(), b.length())).collect(Collectors.toMap(
                    name -> name,name -> name.length(),(a, b) -> a,LinkedHashMap::new));
	System.out.println(result);
	
	List<String> names = List.of("Java", "SQL", "Spring", "API");

	Map<Integer, List<String>> result1 = names.stream()
	        .collect(Collectors.groupingBy(String::length));
	System.out.println(result1);
	}

}
