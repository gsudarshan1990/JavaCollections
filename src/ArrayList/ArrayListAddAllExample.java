package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAllExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> firstFivePrimeNumbers=new ArrayList<Integer>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		List<Integer> firstTenPrimeNumbers=new ArrayList<Integer>(firstFivePrimeNumbers);
		List<Integer> nextFivePrimeNumber=new ArrayList<Integer>();
		nextFivePrimeNumber.add(13);
		nextFivePrimeNumber.add(17);
		nextFivePrimeNumber.add(19);
		nextFivePrimeNumber.add(23);
		nextFivePrimeNumber.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumber);
		System.out.println(firstTenPrimeNumbers);
	}

}
