// Java program to convert HashSet to array
import java.util.*;

public class hassetToarray {
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("1");
		set.add("13");
		set.add("27");
		set.add("87");
		set.add("19");

		System.out.println("Hash Set Contains :" + set);
		String arr[] = new String[set.size()];
		
		// toArray() method converts the set to array
		set.toArray(arr);

		for (String n : arr)
			System.out.println(n);
	}
}
