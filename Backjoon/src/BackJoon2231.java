import java.util.Scanner;

public class BackJoon2231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println(findConstructor(num));
		

	}
	public static int findConstructor(int num) {
		int temp = num;
		int result = 0;
		
		while(temp > 0) {
			
			boolean calcedResult = calcConstructor(temp, num);
			
			if(calcedResult == true) {
				result = temp;
			}
			
			
			temp--;
			
		}
		
		
		
		
		
		return result;
	}
	
	public static boolean calcConstructor(int num, int target) {
		int temp = num;
		int result = num;
		
		while(temp != 0) {
			
			result = result + temp % 10;
			temp = temp / 10;
			
		}
		
		if(result == target) {
			
			return true;
		}
		
		return false;
		
	}

}
