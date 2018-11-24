package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetDuplicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] myfriendnames= {new String("Harin"),new String("Sai kiran"),new String("Sonu"),new String("Harin")};
		Set<String> s=new HashSet<String>(Arrays.asList(myfriendnames));
		System.out.println(s);
		
	}

}
