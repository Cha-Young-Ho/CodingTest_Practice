import java.math.BigInteger;
import java.util.Scanner;

public class BackJoon10757 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		BigInteger firstNum = new BigInteger(sc.next());
		BigInteger secondNum = new BigInteger(sc.next());
		sc.close();
		System.out.println(firstNum.add(secondNum));
	}

}
