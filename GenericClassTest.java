import java.util.Arrays;

public class GenericClassTest {

	public static void main(String[] args) {
		Integer[] intArray = {90,70,60,42,51,10,20,30,40,80};
		Character[] charArray = {'Z','X','A','D','V','M','1','0','B','E','C','F'};
		
		System.out.println("Printing Integer Array [] : ");
		printArray(intArray);
		
		System.out.println("Printing Character Array [] : ");
		printArray(charArray);
	}
	
	public static <A> void printArray(A[] elements){
		for(A element : elements){
			System.out.println(element);
		}
		Arrays.sort(elements);
		array .sort(elements);
		System.out.println("Your Sorted Array : "+Arrays.toString(elements));
	}
}
