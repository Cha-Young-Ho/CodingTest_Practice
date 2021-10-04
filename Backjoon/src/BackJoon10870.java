import java.util.Scanner;

public class BackJoon10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		if(num == 1) {
			System.out.println(1);
			return;
		}
		
		if(num == 0) {
			System.out.println(0);
			return;
		}
		
		System.out.println(findFibonacci(0, 1, 2, num));
		
		
	}
	
	public static int findFibonacci(int prepreNumber, int preNumber, int location, int num) {
		
		int nextNumber = prepreNumber + preNumber;
		prepreNumber = preNumber; 
		
		if(location == num) {
			return nextNumber;
		}
		location++;
		return findFibonacci(prepreNumber, nextNumber, location, num);
		
		
	}

}
