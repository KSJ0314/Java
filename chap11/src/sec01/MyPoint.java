package sec01;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof MyPoint) {
			MyPoint p = (MyPoint) obj;
			if (x == p.x && y == p.y) {
				return true;
			}
		}
		
		return false;
	}

	
}
