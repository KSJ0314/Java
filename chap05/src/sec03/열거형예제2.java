package sec03;

import java.util.Calendar;

public class ����������2 {

	public static void main(String[] args) {

		Part today = null;

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
//
//		switch (month) {
//			case 1:
//			case 2:
//			case 3: today = Part.�ϻ�б�; break;
//			case 4:
//			case 5:
//			case 6: today = Part.�̻�б�; break;
//			case 7:
//			case 8:
//			case 9: today = Part.���б�; break;
//			default: today = Part.���б�;
//		}
		
		if (month <= 3) { today = Part.�ϻ�б�;
		} else if (month <= 6) { today = Part.�̻�б�;
		} else if (month <= 9) { today = Part.���б�;
		} else { today = Part.���б�;
		}

		System.out.printf("���� ���� %s �Դϴ�.\n", today);

	}

}
