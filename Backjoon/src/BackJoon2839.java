import java.util.Scanner;

public class BackJoon2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kg = sc.nextInt();

		sc.close();
		
		if(checkMake(kg)) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(findBagCount(kg));
		
	}

	public static boolean checkMake(int kg) {

		if (kg == 1 || kg == 2 || kg == 4 || kg == 7) {

			return true;

		}
		return false;
	}
	
	public static int findBagCount(int kg) {
		
		int bag3 = 0;
		int bag5 = 0;
		
		if(kg % 5 == 0) {
			bag5 = kg / 5;
			return bag3 + bag5;
			
		}
		
		while(true) {
			
			bag3++;
			int temp = (kg-bag3*3);
			
			if(temp % 10 == 0 || temp % 10 == 5) {
				bag5 = (kg- bag3*3) / 5;
				
				return bag3 + bag5;
			}
			
		}
		
		
		
	}

}
