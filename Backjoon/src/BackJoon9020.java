import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon9020 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		int i = 0;
		while(i < testCase) {
			
			int num = sc.nextInt();
			
			printGold(num);
			i++;
		}
	}
	
	public static void printGold(int number) {
		
		int i = 2;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
		arr = findPriArr(number);
		
		//2 3 5 7 11 13
		
		int first = 0;
		int second = 0;
		boolean find = false;
		
		i = 0;
		while(i < arr.size()) {
			
			int j = i;
			
			
			
			while(j < arr.size()) {
				
				if(arr.get(i) + arr.get(j) == number && find == false) {
					first = arr.get(i);
					second = arr.get(j);
					find = true;
					break;
				}
				
				if(arr.get(i) + arr.get(j) == number && find == true) {
					
					if(second - first >= arr.get(j) - arr.get(i)) {
						first = arr.get(i);
						second = arr.get(j);
					}
					
				}
				
				j++;
			}
			
			
			i++;
		}
		
		System.out.print(first + " " + second);
		System.out.println("");
		
	}
	
	public static ArrayList<Integer> findPriArr(int number){
		int i = 2;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(i < number - 1) {
			
			
			if(getPri(i)) {
				
				arr.add(i);
			}
			
			i++;
			
		}
		
		return arr;
	}
	
	public static boolean getPri(int location) {
		
		int i = 2;
		
		while(i*i <= location) {
			
			if(location % i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
