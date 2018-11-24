package Set;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> tset=new TreeSet<String>();
		tset.add("Java");
		tset.add("J2EE");
		tset.add("Servlets");
		tset.add("JSP");
		tset.add("JDBC");
		
		System.out.println(tset);
	}

}
