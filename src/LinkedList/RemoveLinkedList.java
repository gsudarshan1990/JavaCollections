package LinkedList;

import java.util.LinkedList;

public class RemoveLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> programminglanguages=new LinkedList<String>();
		programminglanguages.add("Assembly");
		programminglanguages.add("Fortron");
		programminglanguages.add("Pascal");
		programminglanguages.add("C");
		programminglanguages.add("C++");
		programminglanguages.add("C#");
		programminglanguages.add("Java");
		programminglanguages.add("Javascript");
		programminglanguages.add("Python");

		System.out.println("All programming languages:"+programminglanguages);
		
		System.out.println("After remove first:"+programminglanguages.removeFirst()+programminglanguages);
		System.out.println("After remove last:"+programminglanguages.removeLast()+programminglanguages);
		System.out.println("After remover c#:"+programminglanguages.remove("C#")+programminglanguages);
		programminglanguages.clear();
		System.out.println("After clear"+programminglanguages);
		
		
		
	}

}
