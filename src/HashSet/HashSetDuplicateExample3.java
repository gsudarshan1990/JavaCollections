package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicateExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {new String("Harin"),new String("Sonu"),new String("Deepu"),new String("Sai kiran")};
		Set<String> s=new HashSet<String>();
		Set<String> s1=new HashSet<String>();
		
		for(int i=0;i<names.length;i++)
		{
			s.add(names[i]);
		}
		
		s1.add("Harin");
		s.removeAll(s1);
		System.out.println("Set1:"+s);
		System.out.println("Set2:"+s1);
		
		
	}

}
