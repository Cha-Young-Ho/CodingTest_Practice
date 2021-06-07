import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < 9; i++) {
			
			arr.add(sc.nextInt());
		}
		
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			
			if(max < arr.get(i)) {
				index = (i + 1);
				max = arr.get(i);
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		sc.close();
		
		
	}

}
