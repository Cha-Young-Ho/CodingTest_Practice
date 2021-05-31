import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test_num = sc.nextInt();

		int cnt = 0;

		ArrayList<Integer> repeat_num = new ArrayList<Integer>();
		ArrayList<String> repeat_text = new ArrayList<String>();

		while (cnt < test_num) {

			repeat_num.add(sc.nextInt());
			repeat_text.add(sc.next());
			cnt++;
		}

		cnt = 0;

		while (cnt < test_num) {
			int cnt2 = 0;
			while(cnt2 < repeat_text.get(cnt).length()) {
				int cnt3 = 0;
				while(cnt3 < repeat_num.get(cnt)) {
					System.out.print(repeat_text.get(cnt).charAt(cnt2));
					cnt3++;
				}
				cnt2++;
			}
			System.out.println("");
			cnt++;
		}
		System.out.println("");

	}

}
