import java.util.ArrayList;

public class BackJoon4673 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(10000);
		int cnt = 0;
		while(cnt < 10000) {
			arr.add(cnt);
			cnt++;
		}
		int num = 1;

		while (num < 10000) {
			
			SelfNumber(num, arr);
			num++;
		}
		cnt = 1;
		while(cnt < 10000) {
			if(arr.get(cnt) == cnt) {
				System.out.println(cnt);
			}
			cnt++;
		}
	}

	public static void SelfNumber(int num, ArrayList<Integer> arr) {
		int result = 0;
		if(num < 10) {
			result = num + num%10;
			
		}else if(num < 100) {
			result = num + num%10+(num/10)%10;
		}else if(num < 1000) {
			result = num + num%10+(num/10)%10 + (num/100)%10;
		}else{
			result = num + num%10 +(num/10)%10 + (num/100)%10 + (num/1000)%10; 
		}
		if(result < 10000) {
			arr.set(result, -1);
			SelfNumber(result, arr);
		}
		

	}
}
