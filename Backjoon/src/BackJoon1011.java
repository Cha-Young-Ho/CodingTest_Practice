
import java.util.Scanner;

public class BackJoon1011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int i = 0;
		while(i < count) {
			
			System.out.println(calcDistance(sc.nextInt(), sc.nextInt()));
			
			i++;
		}
		
		sc.close();

	}
	
	public static int calcDistance(int start, int end) {
		
		int beforeMove = 1;
		int location = start;
		int result = 1;
		
		while(true) {
			System.out.println("distance 계산");
			location += calcMove(beforeMove, end - location);
			
			if(location == end) {
				break;
			}
			
			result ++;
			
		}
		
		
		return result;
	}
	
	public static int calcMove(int beforeMove, int distance) {
		
		int factorial = 0;
		
		
		factorial = calcFactorial(beforeMove, factorial);
		
		
		if(factorial == distance) {
			//유지
			return beforeMove;
		}
		
		if(factorial > distance) {
			// 1개 -
			return beforeMove - 1;
		}
		
		// 1개 + 해서 체크하기 -> distance가 더 크면 +1 / 더 작으면 유지해서
		
		if(factorial + beforeMove + 1 < distance) {
			return beforeMove + 1;
		}
		
		return beforeMove;
		
		
	}
	
	public static int calcFactorial(int beforeMove, int factorial) {
		System.out.println("factorial 계산");
		factorial += beforeMove--;
		if(beforeMove == 0) {
			return factorial;
		}
		
		return calcFactorial(beforeMove, factorial);
	}

}
