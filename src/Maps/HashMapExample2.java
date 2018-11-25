package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Object> hmap=new HashMap<String,Object>();
		
		hmap.put("height",new Integer(163) );
		hmap.put("weight", new Integer(78));
		hmap.put("age", new Integer(28));
		hmap.put("first name", "Shashank");
		hmap.put("last name","Garrimella");
		
		System.out.println("The hashmap holds "+hmap.size()+" elements");
		System.out.println("=================");
		System.out.println("The keys are as below");
		Set<String> key=hmap.keySet();
		
		for(String keys:key)
		{
			System.out.println(keys);
		}
		System.out.println("==========================");
		System.out.println("The values are:");
		Collection<Object> values=hmap.values();
		
		for(Object objectvalue:values)
		{
			System.out.println(objectvalue);
		}
		
		System.out.println("The value for the key \"age\" is:");
		System.out.println(hmap.get("age"));
		
		System.out.println("The value for the key \"hat\" is:");
		System.out.println(hmap.get("hat"));
		
		System.out.println("Retrieving the values through the entry key set");
		
		Set<Entry<String,Object>> entrysets=hmap.entrySet();
		
		for(Entry<String,Object> entryset:entrysets)
		{
			System.out.println("The key is : "+entryset.getKey()+", value is:"+entryset.getValue());
		}
		
	}
}
