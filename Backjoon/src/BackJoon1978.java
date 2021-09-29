
import java.util.Scanner;

public class BackJoon1978 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		
		
		int result = 0;
		
		int i = 0;
		while(i < caseNum) {
			
			int temp = sc.nextInt();
			if(temp == 1) {
				i++;
				continue;
			}
			if(checkPrimality(temp)) {
				result++;
			}
			
			i++;
			
			
		}
		
		System.out.println(result);
		
		sc.close();

	}
	
	public static boolean checkPrimality(int number) {
		// i * i <=number 중에서 i로 나누어 떨어지는 수가 으면 끝
		// i * i > number 를 기점으로 새로운 숫자가 출현하지 않는다.
		int i = 2;
		while(i * i <= number) {
			if(number % i == 0) {
				return false;
			}
			i += 1;
		}
		
		return true;
		
		
	}
}
