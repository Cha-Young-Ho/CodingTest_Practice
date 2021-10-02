import java.util.Scanner;

public class BackJoon1193 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int receiveNumber = sc.nextInt();
		sc.close();
		
		int line = 1;
		
		int temp = 1;
		int indexNumber = 0;
		while(true) {
			
			if(receiveNumber - temp <= 0) {
				break;
			}
			
			receiveNumber -= temp;
			indexNumber = receiveNumber;
			temp++;
			line ++;
			
		}
		
		
		
		
		System.out.println(findNumber(line, indexNumber));
	}
	
	public static String findNumber(int line, int indexNumber) {
		
		int firstNumber = 1;
		int secondNumber = line;
		int i = 0;
		while(i  < indexNumber - 1) {
			firstNumber ++;
			secondNumber --;
			i++;
		}
		
		

		
		//È¦¼öÀÏ °æ¿ì
		if(line % 2 == 1) {
			
			return ""+secondNumber + '/' + firstNumber;
		}
		
		return ""+firstNumber + '/' + secondNumber;
	}

}
