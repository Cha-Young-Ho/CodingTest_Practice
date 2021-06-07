import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon10818 {

	public static void main(String[] args) {
		
		System.out.println("!");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < a; i++) {
			arr.add(sc.nextInt());
		}
		
		int max = arr.get(0);
		int min = arr.get(0);
		
		for (int i = 0; i < arr.size(); i++) {
			
			if(max < arr.get(i)) {
				max = arr.get(i);
			}
			
			if(min > arr.get(i)) {
				min = arr.get(i);
			}
		}
		
		
		System.out.println(min + " " + max);
		
		sc.close();
		
		

	}

}
