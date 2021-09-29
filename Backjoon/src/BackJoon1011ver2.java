import java.util.Scanner;
 
public class BackJoon1011ver2 {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
 
		int caseNum = sc.nextInt();	// �׽�Ʈ ���̽� 
		
		for(int i = 0; i < caseNum; i++) {
        
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int distance = Y - X;	// �Ÿ�
			
			int max = (int)Math.sqrt(distance);	// �Ҽ��� ����
            
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