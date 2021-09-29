
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
		// i * i <=number �߿��� i�� ������ �������� ���� ���� ��
		// i * i > number �� �������� ���ο� ���ڰ� �������� �ʴ´�.
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
