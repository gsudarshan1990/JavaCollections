package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> hmap=new HashMap<String,Integer>();
		hmap.put("height", new Integer(72));
		hmap.put("weight",new Integer(180));
		hmap.put("age", new Integer(21));
		hmap.put("shoe", new Integer(11));
		hmap.put("sleeve",new Integer(35));
		
		System.out.println("The Hash Map holds "+hmap.size()+" elements");
		System.out.println("The keys are:");
		Set<String> keys=hmap.keySet();
		
		for(String keyvalue:keys)
		{
			System.out.println(keyvalue);
		}
		
		System.out.println("The values are");
		
		Collection<Integer> values=hmap.values();
		
		for(Integer mapvalue:values)
		{
			System.out.println(mapvalue);
		}
	
		System.out.println("The value for key \"age\" is");
		System.out.println(hmap.get("age").toString());
		
		System.out.println("The value for key \"hat\" is");
		System.out.println(hmap.get("hat"));
		
	}
	

}
