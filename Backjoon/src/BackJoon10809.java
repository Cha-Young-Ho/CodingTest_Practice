import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon10809 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int cnt = 0;
		while(cnt < 26) {
			
			arr.add(-1);
			
			cnt++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		cnt = 0;
		
		while(cnt < str.length()) {
			char a = str.charAt(cnt);
			
			if(arr.get(a-'a') == -1) {
				arr.set(a - 'a', cnt);
			}
			
			cnt++;
		}
		
		cnt = 0;
		
		while(cnt < arr.size()) {
			System.out.println(arr.get(cnt));
			
			cnt++;
		}
		
		
		sc.close();

	}

}
