package CollectionsRepeatable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(13);
		numbers.add(7);
		numbers.add(18);
		numbers.add(5);
		numbers.add(2);
		
		System.out.println("Before Sort:"+numbers);
		Collections.sort(numbers);
		System.out.println("After Sort:"+numbers);
	}

}