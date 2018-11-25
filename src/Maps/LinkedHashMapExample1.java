package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map= new LinkedHashMap<Integer,String>();
		
		for(int i=0;i<10;i++)
		{
			map.put(new Integer(i), "*");
		}
		
		Set<Entry<Integer,String>> entrysets=map.entrySet();
		String output="";
		for(Entry<Integer,String> entryset:entrysets)
		{
			output+=" "+entryset.getKey()+":"+entryset.getValue();
		}
		System.out.println(output);
	}
}
