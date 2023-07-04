package sec03;

import java.util.Calendar;

public class 열거형예제2 {

	public static void main(String[] args) {

		Part today = null;

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
//
//		switch (month) {
//			case 1:
//			case 2:
//			case 3: today = Part.일사분기; break;
//			case 4:
//			case 5:
//			case 6: today = Part.이사분기; break;
//			case 7:
//			case 8:
//			case 9: today = Part.삼사분기; break;
//			default: today = Part.사사분기;
//		}
		
		if (month <= 3) { today = Part.일사분기;
		} else if (month <= 6) { today = Part.이사분기;
		} else if (month <= 9) { today = Part.삼사분기;
		} else { today = Part.사사분기;
		}

		System.out.printf("현재 월은 %s 입니다.\n", today);

	}

}
