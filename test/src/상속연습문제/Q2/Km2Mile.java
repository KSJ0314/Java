package 상속연습문제.Q2;

public class Km2Mile extends Converter {
	
	double div;

	public Km2Mile(double div) {
		this.div = div;
	}

	@Override
	protected double convert(double src) {
		return src/div;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}

}
