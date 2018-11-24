package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListObjectSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people=new ArrayList<Person>();
		people.add(new Person("Sachin",47));
		people.add(new Person("Chris",34));
		people.add(new Person("Rajevv",25));
		people.add(new Person("David",31));
		
		System.out.println("Person List:"+people);
		Collections.sort(people, new StudentsCompare());
		System.out.println("Person List after sort:"+people);
		
			
	}

}
