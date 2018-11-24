package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>();
		names.add("sudarshan");
		names.add("suraj");
		names.add("govindarajan");
		names.add("raju");
		
		String[] namesarray=new String[names.size()];
		namesarray=names.toArray(namesarray);
		
		for(int i=0;i<namesarray.length;i++)
		{
			System.out.println(namesarray[i]);
		}
		
	}

}
