import java.util.*;

public class BackJoon3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		int findX, findY;
		
		for(int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();
		
		if(x[1] == x[2])
			findX = x[0];
		else
			findX = (x[0] == x[1]) ? x[2] : x[1];
		
		if(y[1] == y[2])
			findY = y[0];
		else
			findY = (y[0] == y[1]) ? y[2] : y[1];
			
		System.out.println(findX + " " + findY);
		
		
	}
}