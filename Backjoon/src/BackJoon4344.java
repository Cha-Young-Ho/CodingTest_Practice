import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int case_num = sc.nextInt();
		int case_cnt = 0;
		ArrayList<Float> student_percent = new ArrayList<Float>();
		ArrayList<Integer> student_score = new ArrayList<Integer>();
		
		while(case_cnt < case_num) {
			
			int arr_num = sc.nextInt();
			int arr_cnt = 0;
			
			student_score.clear();
			while(arr_cnt < arr_num) {
				student_score.add(sc.nextInt());
				arr_cnt++;
				
			}
			float avg = 0;
			
			arr_cnt = 0;
			while(arr_cnt < student_score.size()) {
				avg += student_score.get(arr_cnt);
				
				arr_cnt++;
			}
			
			avg = avg/arr_num;
			
			
			
			arr_cnt = 0;
			int arr_cnt2 = 0;
			while(arr_cnt < arr_num) {
				if(student_score.get(arr_cnt) > avg) {
					arr_cnt2++;
				}
				arr_cnt++;
			}
			student_percent.add((float)arr_cnt2 / student_score.size());
			case_cnt++;
		}
		case_cnt = 0;
		while(case_cnt < case_num) {
			
			
			System.out.println(String.format("%.3f", student_percent.get(case_cnt) * 100) + "%");
			case_cnt++;
		}
		
		sc.close();

	}

}
