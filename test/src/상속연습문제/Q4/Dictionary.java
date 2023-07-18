package 상속연습문제.Q4;

public class Dictionary extends PairMap {
	
	public Dictionary(int num) {
		KeyArray = new String[num];
		valueArray = new String[num];
	}

	@Override
	String get(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i] == null||KeyArray[i].isEmpty()) {
				return null;
			} else if (KeyArray[i].equals(key)) {
				return valueArray[i];
			} 
		}
		return null;
	}

	@Override
	void put(String ket, String value) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i] == null||KeyArray[i].isEmpty()) {
				KeyArray[i] = ket;
				valueArray[i] = value;
				break;
			} else if (KeyArray[i].equals(ket)) {
				valueArray[i] = value;
				break;
			}
		}
	}

	@Override
	String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i].equals(key)) {
				String returnValue = valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				return returnValue;
			}
		}
		return null;
	}

	@Override
	int length() {
		int sum = 0;
		for (int i = 0; i < KeyArray.length; i++) {
			if (KeyArray[i] != null && !KeyArray[i].isEmpty()) {
				sum++;
			}
		}
		return sum;
	}

}
