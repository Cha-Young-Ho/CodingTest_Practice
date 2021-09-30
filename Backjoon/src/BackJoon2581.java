import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon2581 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(start <= end) {
			if(start == 1 || start == 0) {
				start++;
				continue;
			}
			if(calcP(start)) {
				arr.add(start);
			}
			start++;
		}
		
		
		int i = 0;
		int result = 0;
		while(i < arr.size()) {
			result += arr.get(i);
			
			i++;
					
		}
		if(arr.size() == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(result);
		System.out.println(arr.get(0));
		
		
	}
	
	public static boolean calcP(int start) {
		
		int i = 2;
		while(i*i <= start) {
			
			if(start % i == 0) {
				return false;
			}
			i+=1;
		}
		
		return true;
	}
	
	
	

}
