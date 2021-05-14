import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			arr.add(sc.nextInt() % 42);
		}
		
		int count = 0;
		
		for (int i = 0; i <arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if(arr.get(i) == arr.get(j)) {
					arr.remove(j);
				}
			}
		}
	}

}
