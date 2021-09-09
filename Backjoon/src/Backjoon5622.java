import java.util.Scanner;

public class Backjoon5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		
		int result = 0;
		
		int[] resultArr = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			resultArr[i] = (int)str.charAt(i) % 65;
		}
		for (int i = 0; i < resultArr.length; i++) {
			int num = resultArr[i] / 3;
			
			switch (num) {
			case 0: 
				result += 3;
				break;
			case 1: 
				result += 4;
				break;
			case 2: 
				result += 5;
				break;
			case 3: 
				result += 6;
				break;
			case 4: 
				result += 7;
				break;
			case 5: 
				result += 8;
				break;
			case 6: 
				result += 9;
				break;
			case 7: 
				result += 10;
				break;
			case 8:
				result += 10;
				break;
		
		}
		
		
	}
		System.out.println(result);
	}

}
