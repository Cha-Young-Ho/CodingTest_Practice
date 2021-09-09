import java.util.Scanner;

public class Backjoon1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String arr = sc.nextLine();
		String[] split_arr = arr.split(" ");
		int length = split_arr.length;

		for (int i = 0; i < split_arr.length; i++) {
			if(split_arr[i].contains(" ")) {
				length -= split_arr[i].length();
			}
		}
		
		System.out.println(split_arr.length);
		
		
		
		
		
		sc.close();

	}

}
