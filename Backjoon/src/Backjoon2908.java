import java.util.Scanner;

public class Backjoon2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		a = reverse(a);
		b = reverse(b);
		
		if(a > b) {
			System.out.println(a);
			
		}else {
			System.out.println(b);
		}
		
		sc.close();
		
		
	}
	
	public static int reverse(int num) {
		
		
		//100의 자리 -> 1의 자리
		int first = num/100;
		
		// 10의 자리 -> 10의 자리
		int second = num%100/10;
		
		// 1의 자리 -> 100의 자리
		int third = num %10;
		
		int result = third* 100 + second * 10 + first; 
		
		
		
		
		return result;
		
	}

}
