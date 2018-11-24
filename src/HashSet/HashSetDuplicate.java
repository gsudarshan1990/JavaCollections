package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name= {new String("Sang"),new String("Shin"), new String("Boston"),new String("Shin")};
		
		Set<String> s=new HashSet<String>();
		
		for(int i=0;i<name.length;i++)
		{
			if(!s.add(name[i]))
			{
				System.out.println("Duplicate word:"+name[i]);
			}
		}
		
		System.out.println("Unique word is:"+s);
	}

}
