import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a * b * c;
		int per = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		for (int i = 0; i < 10; i++) {
			arr.add(0);
		}
		
		while(result != 0) {
			per = result % 10;
			
			switch (per) {
			case 0: arr.set(0, arr.get(0) + 1); break;
			case 1: arr.set(1, arr.get(1) + 1);break;
			case 2: arr.set(2, arr.get(2) + 1);break;
			case 3: arr.set(3, arr.get(3) + 1);break;
			case 4: arr.set(4, arr.get(4) + 1);break;
			case 5: arr.set(5, arr.get(5) + 1);break;
			case 6: arr.set(6, arr.get(6) + 1);break;
			case 7: arr.set(7, arr.get(7) + 1);break;
			case 8: arr.set(8, arr.get(8) + 1);break;
			case 9: arr.set(9, arr.get(9) + 1);break;
			
			
			}
			
			result /= 10;
		}
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		sc.close();

	}

}
