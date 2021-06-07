import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon1000 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float N;
		
		N = sc.nextFloat();
		
		ArrayList<Float> list = new ArrayList<Float>();
		
		float max = 0;
		for (int i = 0; i < N; i++) {
			float input = sc.nextFloat();
			list.add(input);
			if(max < input) {
				max = input;
			}
		}
		
		
		float result = 0;
		
		for (int i = 0; i < list.size(); i++) {
			result += (list.get(i) / max) *100;
			
		}
		
		System.out.println(result/N);
		sc.close();
		
		
		
		
		
		
	}

}
