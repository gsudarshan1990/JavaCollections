package CollectionsRepeatable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students=new ArrayList<Student>();
		students.add(new Student("sudarshan",28));
		students.add(new Student("venkadesan",25));
		students.add(new Student("harin",24));
		students.add(new Student("kiran",27));
		
		System.out.println("Before sort"+students);
		Collections.sort(students, new compareStudents());
		System.out.println("After sort:"+students);
	
	}

}
