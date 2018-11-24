package CollectionsRepeatable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(13);
		numbers.add(18);
		numbers.add(25);
		numbers.add(40);
		
		Iterator<Integer> iterator=numbers.iterator();
		while(iterator.hasNext())
		{
			int num=iterator.next();
			if(num%2 != 0)
			{
				iterator.remove();
				
			}
		}
		System.out.println(numbers);
	}

}
