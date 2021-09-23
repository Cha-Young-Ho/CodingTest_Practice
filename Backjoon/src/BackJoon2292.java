import java.util.Scanner;

public class BackJoon2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int receive_number = sc.nextInt();

		int finding_room = 1;
		int finding_room_maximum_number = 1;

		while (true) {

			if (receive_number <= 1) {
				System.out.println(finding_room);
				break;
			}

			if (receive_number <= finding_room_maximum_number) {

				System.out.println(finding_room);
				break;
			}

			finding_room++;
			finding_room_maximum_number += (finding_room - 1) * 6;

		}

		sc.close();

	}

}
