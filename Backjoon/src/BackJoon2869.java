import java.util.Scanner;

public class BackJoon2869 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();

		int mm = (V - B) / (A - B);
		int percent = (V - B) % (A - B);

		if(percent != 0) {
			mm++;
		}

		System.out.println(mm);

	}

}
