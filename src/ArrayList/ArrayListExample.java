package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> companies=new ArrayList<String>();
		
		System.out.println("Check the companies is empty or not:"+companies.isEmpty());
		
		companies.add("Google");
		companies.add("Apple");
		companies.add("Microsoft");
		companies.add("Amazon");
		companies.add("Facebook");
		
		System.out.println("Here are the top "+companies.size()+" in the word");
		System.out.println(companies);
		
		String bestCompany=companies.get(0);
		String secondBestCompany=companies.get(1);
		String lastCompany=companies.get(companies.size()-1);
		
		System.out.println(bestCompany);
		System.out.println(secondBestCompany);
		System.out.println(lastCompany);
		
		companies.set(4, "Walmart");
		System.out.println("Modiefied companies is:"+companies);
	}

}
