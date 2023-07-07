package sec04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TravelExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Travel travel = new Travel();

		travel.setOil(20);
		travel.setLocation("광주");

		System.out.printf("현재 지역은 %s, 남은 휘발유는 %dL입니다.\n", travel.getLocation(), travel.getOil());

		while (travel.isOil()) {
			System.out.println("\n-------------------------------------------------\n");
			System.out.println("여행할 지역명을 입력하세요. ");
			System.out.print("1.서울(-10L) | 2.부산(-5L) | 3.광주(-3L) | 4.화순(-2L)\n> ");
			String location = br.readLine();
			if (travel.getLocation().equals(location)) {
				System.out.println("현재 지역과 같습니다. 다시 입력해주세요.");
				continue;
			}
			switch (location) {
				case "1":
				case "서울":
					travel.minusOil(10);
					travel.setLocation("서울");
					break;
				case "2":
				case "부산":
					travel.minusOil(5);
					travel.setLocation("부산");
					break;
				case "3":
				case "광주":
					travel.minusOil(3);
					travel.setLocation("광주");
					break;
				case "4":
				case "화순":
					travel.minusOil(2);
					travel.setLocation("화순");
					break;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력하세요.");
					continue;
			}
			System.out.printf("%s(으)로 이동했습니다. 남은 휘발유는 %dL입니다.\n", travel.getLocation(), travel.getOil());
			if (travel.isOil()) {
				System.out.println("휘발유가 남았어요. 계속 여행하세요.");
			} else {
				System.out.println("휘발유가 없어요. 여행 끝났어요.");
			}
		}

	}

}
