
public class BackJoon15596 {

	public static long sum(int[] a) {

		int cnt = 0;
		long sum = 0;

		while (cnt >= a.length) {

			sum += a[cnt];

			cnt++;
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(sum(a));

	}

}
