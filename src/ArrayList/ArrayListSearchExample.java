package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Alice");
		names.add("Bob");
		names.add("Steve");
		names.add("John");
		names.add("Steve");
		names.add("Maria");
		
		System.out.println("Does the names array contains \"Bob\":"+names.contains("Bob"));
		
		System.out.println("index of \"Steve\":"+names.indexOf("Steve"));
		System.out.println("index of \"Mark\":"+names.indexOf("Mark"));
		
		System.out.println("Lastindex of \"John\":"+names.lastIndexOf("John"));
		System.out.println("Lastindex of \"Bill\":"+names.lastIndexOf("Bill"));
	}

}
