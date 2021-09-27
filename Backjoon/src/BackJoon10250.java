import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i = 0;
		ArrayList<String> roomNumber = new ArrayList<String>();
		while(i < num) {
			
			
			
			Hotel hotel = new Hotel(sc.nextInt(), sc.nextInt());
			roomNumber.add(hotel.calcRoomNumber(sc.nextInt()));
			
			i++;
		}
		sc.close();
		
		i = 0;
		while(i < roomNumber.size()) {
			
			System.out.println(roomNumber.get(i));
			i++;
		}
		

	}
	
}

class Hotel{
	
	int weight = 1;
	int height = 1;
	
	
	Hotel(int height, int weight){
		this.weight = weight;
		this.height = height;
	}
	
	public String calcRoomNumber(int num) {
		
		int roomHeight = 0;
		int roomWeight = 0;
		int i = 1;
		while(true) {
			
			if(num - height *i <= 0) {
				roomWeight = i;
				roomHeight = num - height* (i-1);
				break;
			}
			i++;
			
		}
		
		if(roomWeight < 10) {
			return ""+roomHeight+"0" + roomWeight;
		}
		
		return ""+roomHeight+roomWeight;
	}
	
}




