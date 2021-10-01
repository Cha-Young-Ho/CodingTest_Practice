import java.util.Scanner;

public class BackJoon1929 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		
		int second = sc.nextInt();
		
		sc.close();
		
		int i = first;
		
		while(i <= second){
			if(i == 1) {
				i++;
				continue;
			}
			if(checkP(i)) {
				System.out.println(i);
			};
			
			i++;
		}
		
	}
	
	public static boolean checkP(int number) {
		
		int i = 2;
		
		while(i*i <= number) {
			
			if(number % i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
		
	}
}
