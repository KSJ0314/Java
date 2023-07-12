package sec02;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire ¼ö¸í : " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire ÆãÅ© ***");
			return false;
		}
	}
}
