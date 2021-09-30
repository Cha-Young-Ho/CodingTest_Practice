import java.util.Scanner;

public class BackJoon11653 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		sc.close();
		
		int i = 2;
		
		while(i <= number) {
			
			if(number == 1) {
				break;
			}
			
			if(find(i, number)) {
				System.out.println(i);
				number /= i;
				continue;
			}
			i++;
		}
		
		
	}
	
	public static boolean find(int i, int num) {
		
		if(num % i == 0) {
			return true;
		}
		
		return false;
	}

}
