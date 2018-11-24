package CollectionsRepeatable;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> friends=new ArrayList<String>();
		friends.add("harin");
		friends.add("Sai kiran");
		friends.add("sonu");
		friends.add("Deepu");
		friends.add("praful");
		friends.add("rohit");
		
		String[] friendsarray=new String[friends.size()];
		friendsarray=friends.toArray(friendsarray);
		for(int i=0;i<friendsarray.length;i++)
		{
			System.out.println(friendsarray[i]);
		}
	}

}
