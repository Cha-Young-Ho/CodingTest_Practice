import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


/*
 * ����:
 * �� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǿ� ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. 
 * �� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, 
 * �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� ȸ���� �ִ� ������ ã�ƺ���. 
 * ��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�. 
 * ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�. �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.
 * 
 * �Է�:
 * ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����.
 * ��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. 
 * ���� �ð��� ������ �ð��� 231-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * 
 * ���:
 * ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.
 */
public class BackJoon1931 {

	public static void main(String[] args) {

		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3} , {4,4,1}, {1,7,3}};
		
		int[] aab = solution(array, commands);
		
	}
	
	static int[] solution(int[] array, int[][] commands){
        
        
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < commands.length; i++) {
			for (int j = 0; j < (commands[i][1]-commands[i][0]) + 1; j++) {
				a.add(commands[i][j]);
			}
			for (int j = 0; j < a.size(); j++) {
				
				System.out.println("a[" + j +"] = " + a.get(j));
			}
			
		}
        return answer;
    }
		
}


