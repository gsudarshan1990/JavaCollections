package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> friends=new LinkedList<String>();
		friends.add("harin");
		friends.add("kiran");
		friends.add("Deepu");
		friends.add("sonu");
		
		System.out.println(friends);
		friends.add(3, "Sai");
		
		System.out.println("Afteradd(3,\"sai\"):"+friends);
		
		friends.addFirst("Avinash");
		System.out.println("AfteraddFirst(\"Avinash\"):"+friends);
		
		friends.addLast("Suresh");
		System.out.println("AfteraddLast(\"Suresh\"):"+friends);
		
		List<String> familyfriends=new ArrayList<String>();
		familyfriends.add("Balaji");
		familyfriends.add("Vijay");
		friends.addAll(familyfriends);
		System.out.println("After all add:"+friends);
		
		
	}

}
