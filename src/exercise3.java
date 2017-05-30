import java.util.ArrayList;

public class exercise3 {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		
		numberList.add(1);
		numberList.add(23);
		numberList.add(9);
		numberList.add(77);
		numberList.add(922);
		numberList.add(6);
		numberList.add(32);
		numberList.add(63);
		numberList.add(14);
		numberList.add(5);
		System.out.println(numberList);
		containsNumbers(numberList);
		
		Integer twentyThree = 23;
		Integer nineHundredTwentyTwo = 922;
		Integer thirtyTwo = 32;
		Integer six = 6;
		
		numberList.remove(twentyThree);
		numberList.remove(nineHundredTwentyTwo);
		numberList.remove(thirtyTwo);
		numberList.remove(six);
		System.out.println(numberList);
		containsNumbers(numberList);
		
		
		
		
	
	}
	
	public static void containsNumbers(ArrayList<Integer> numberList) {
		

		if (numberList.contains(23)) {
			System.out.println("The list contains 23");
		}
		if (numberList.contains(77)) {
			System.out.println("The list contains 77");
		}
		if (numberList.contains(15)) {
			System.out.println("The list contains 15");
		}
	}	
}
