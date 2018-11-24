package Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class GenericSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] numbers= {new String("2"), new String("3"),new String("4"),new String("1"),new String("2")};
		
		Set<String> s1=new HashSet<String>();
		Set<String> s2=new LinkedHashSet<String>();
		Set<String> s3=new TreeSet<String>();
		
		MyOwnUtilityClass.checkDuplicates(s1, numbers);
		MyOwnUtilityClass.checkDuplicates(s2, numbers);
		MyOwnUtilityClass.checkDuplicates(s3, numbers);
	}

}

class MyOwnUtilityClass
{
	public static void checkDuplicates(Set s,String[] numbers)
	{
		for(int i=0;i<numbers.length;i++)
		{
			s.add(numbers[i]);
		}
		System.out.println(s.getClass().getName()+s);
	}
}
