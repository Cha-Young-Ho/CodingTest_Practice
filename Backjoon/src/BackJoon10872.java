import java.util.Scanner;

public class BackJoon10872 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int result = 1;
		System.out.println(printPactorial(num, result));

	}
	
	public static int printPactorial(int num, int result) {
		
		if(num == 0) {
			return result;
		}
		
		result *= num;
		
		num--;
		
		return printPactorial(num, result);
		
	}

}
