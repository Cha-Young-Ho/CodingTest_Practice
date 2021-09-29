import java.util.Scanner;
 
public class BackJoon1011ver2 {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
 
		int caseNum = sc.nextInt();	// 테스트 케이스 
		
		for(int i = 0; i < caseNum; i++) {
        
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int distance = Y - X;	// 거리
			
			int max = (int)Math.sqrt(distance);	// 소수점 버림
            
			if(max == Math.sqrt(distance)) {
				System.out.println(max * 2 - 1);
			}
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
			
			
		}
		sc.close();
	}
}