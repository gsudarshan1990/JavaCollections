package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> lhmap=new LinkedHashMap<Integer,String>();
		
		lhmap.put(1, "Java");
		lhmap.put(2, "J2EE");
		lhmap.put(3,"JDBC");
		lhmap.put(4,"Servlets");
		lhmap.put(5,"JSP");
		
		
		Set<Entry<Integer,String>> entrysets=lhmap.entrySet();
		for(Entry<Integer,String> entryset:entrysets)
		{
			System.out.println(entryset.getKey()+":"+entryset.getValue());
		}
		
		
	}

}
