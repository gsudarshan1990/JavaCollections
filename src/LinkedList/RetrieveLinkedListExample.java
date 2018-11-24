package LinkedList;

import java.util.LinkedList;

public class RetrieveLinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Double> stockPrices=new LinkedList<Double>();
		stockPrices.add(45.00);
		stockPrices.add(51.00);
		stockPrices.add(62.50);
		stockPrices.add(42.75);
		stockPrices.add(36.80);
		stockPrices.add(68.40);
		
		System.out.println("First:"+stockPrices.getFirst());
		System.out.println("Last:"+stockPrices.getLast());
		System.out.println("Third:"+stockPrices.get(2));
		
	}

}
