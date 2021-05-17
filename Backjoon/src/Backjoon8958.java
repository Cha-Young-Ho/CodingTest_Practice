import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Backjoon8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int case_num = sc.nextInt();
		int cnt = 0;
		ArrayList<String> input_arr = new ArrayList<String>(case_num);
		while(cnt < case_num) {
			
			input_arr.add(sc.next());
			
			cnt++;
		}
		
		int O_num = 0;
		Stack<Character> str_stack = new Stack<Character>();
		cnt = 0;
		while(cnt < case_num) {
			int cnt2 = 0;
			while(cnt2 < input_arr.get(cnt).length()) {
				str_stack.add(input_arr.get(cnt).charAt(cnt2));
				cnt2++;
			}
			int cnt3 = 0;
			
			int sum = 0;
			int result = 0;	
			while(str_stack.size() != 0) {
				
				if(str_stack.pop() =='O') {
					result = result + 1;
					sum += result; 
				}else {
					result = 0;
				}
				
				cnt3++;
			}
			
			System.out.println(sum);
			cnt++;
		}
		
		
		
		sc.close();

	}

}
