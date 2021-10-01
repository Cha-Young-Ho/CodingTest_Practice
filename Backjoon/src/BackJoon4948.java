import java.util.Scanner;

public class BackJoon4948 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		while(true) {
			
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			
			printPiNumber(n);
			
		}
	}
	
	public static void printPiNumber(int n) {
		
		int count = 0;
		int i = n;
		while(i <= 2 * n) {
			if(i == 1 || i == n) {
				i++;
				continue;
			}
			
			if(checkP(i)) {
				count++;
			}
			i++;
		}
		
		
		System.out.println(count);
	}
	
	public static boolean checkP(int num) {
		int i = 2;
		while(i * i <= num) {
			
			if(num % i == 0) {
				
				return false;
				
			}
			i++;
		}
		return true;
	}

}
