import java.util.Scanner;

public class BackJoon4153 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0)
				break;
			int min = Math.min(a, Math.min(b, c));
			int max = Math.max(a, Math.max(b, c));
			int middle = a + b + c - min - max;
			
			if(max * max == middle*middle + min*min) {
				System.out.println("right");
				continue;
			}
			
			System.out.println("wrong");
			
					
					
			
		}
		
		sc.close();

	}

}
