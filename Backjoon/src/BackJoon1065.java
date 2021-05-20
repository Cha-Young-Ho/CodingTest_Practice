import java.util.Scanner;

public class BackJoon1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		
		System.out.println(catch_hansoo(num));
		
	}
	
	public static int catch_hansoo(int num) {
		int hansoo_cnt = 0;
		int cnt = 1;
		while(cnt <= num) {
			
			if(cnt < 10) {
				hansoo_cnt++;
			}else if(cnt < 100) {
				hansoo_cnt++;
			}else if(cnt < 1000) {
				
				int first = (cnt/100)%10 - (cnt/10)%10;
				int second = (cnt/10)%10 - cnt%10;
			
				
				if(first == second) {
					hansoo_cnt++;
				}
			}
			cnt++;
		}
		
		return hansoo_cnt;
	}

}
