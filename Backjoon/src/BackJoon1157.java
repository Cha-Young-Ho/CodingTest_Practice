import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BackJoon1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int cnt = 0;
		
		str = str.toLowerCase();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(cnt < 26) {
			arr.add(0);
			cnt++;
		}
		
		cnt = 0;
		while(cnt < str.length()) {
			
			switch(str.charAt(cnt)) {
			case 'a': arr.set(0, arr.get(0) + 1);break;
			case 'b': arr.set(1, arr.get(1) + 1);break;
			case 'c': arr.set(2, arr.get(2) + 1);break;
			case 'd': arr.set(3, arr.get(3) + 1);break;
			case 'e': arr.set(4, arr.get(4) + 1);break;
			case 'f': arr.set(5, arr.get(5) + 1);break;
			case 'g': arr.set(6, arr.get(6) + 1);break;
			case 'h': arr.set(7, arr.get(7) + 1);break;
			case 'i': arr.set(8, arr.get(8) + 1);break;
			case 'j': arr.set(9, arr.get(9) + 1);break;
			case 'k': arr.set(10, arr.get(10) + 1);break;
			case 'l': arr.set(11, arr.get(11) + 1);break;
			case 'm': arr.set(12, arr.get(12) + 1);break;
			case 'n': arr.set(13, arr.get(13) + 1);break;
			case 'o': arr.set(14, arr.get(14) + 1);break;
			case 'p': arr.set(15, arr.get(15) + 1);break;
			case 'q': arr.set(16, arr.get(16) + 1);break;
			case 'r': arr.set(17, arr.get(17) + 1);break;
			case 's': arr.set(18, arr.get(18) + 1);break;
			case 't': arr.set(19, arr.get(19) + 1);break;
			case 'u': arr.set(20, arr.get(20) + 1);break;
			case 'v': arr.set(21, arr.get(21) + 1);break;
			case 'w': arr.set(22, arr.get(22) + 1);break;
			case 'x': arr.set(23, arr.get(23) + 1);break;
			case 'y': arr.set(24, arr.get(24) + 1);break;
			case 'z': arr.set(25, arr.get(25) + 1);break;
			
			}
			
			cnt++;
		}
		
		int result = 0;
		int index = 0;
		boolean okno = true;
		cnt = 0;
		while(cnt < 26) {
			if(result < arr.get(cnt)) {
				result = arr.get(cnt);
				index = cnt;
				okno = true;
			}else if(result == arr.get(cnt) && result != 0) {
				
				okno = false;
			}
			
			cnt++;
		}
		
		if(okno) {
			char a = 0;
		
			switch(index) {
			case 1: a= 'b';break;
			case 2: a= 'c';break;
			case 3: a= 'd';break;
			case 4: a= 'e';break;
			case 5: a= 'f';break;
			case 6: a= 'g';break;
			case 7: a= 'h';break;
			case 8: a= 'i';break;
			case 9: a= 'j';break;
			case 10: a= 'k';break;
			case 11: a= 'l';break;
			case 12: a= 'm';break;
			case 13: a= 'n';break;
			case 14: a= 'o';break;
			case 15: a= 'p'; break;
			case 16: a= 'q'; break;
			case 17: a= 'r'; break;
			case 18: a= 's'; break;
			case 19: a= 't'; break;
			case 20: a= 'u'; break;
			case 21: a= 'v'; break;
			case 22: a= 'w'; break;
			case 23: a= 'x'; break;
			case 24: a= 'y'; break;
			case 25: a= 'z'; break;
			case 0: a= 'a'; break;
		}
			System.out.println((char)(a - 32));
		}else {
			System.out.println("?");
		}
		sc.close();
	}

}
