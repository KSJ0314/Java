package 상속연습문제.Q2;

public class Won2Dollar extends Converter {
	
	double div;

	public Won2Dollar(double div) {
		this.div = div;
	}

	@Override
	protected double convert(double src) {
		return src/div;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
