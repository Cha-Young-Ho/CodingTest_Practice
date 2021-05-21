import java.util.Scanner;

public class BackJoon11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int strLength = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		int sum = 0;
		while(cnt < strLength) {
			
			sum += str.charAt(cnt) - 48;
			
			
			
			cnt++;
		}
		
		System.out.println(sum);
		sc.close();

	}

}
