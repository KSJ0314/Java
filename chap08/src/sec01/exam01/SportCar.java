package sec01.exam01;

public class SportCar implements Car {

	private int speed;

	public SportCar(int speed) {
		this.speed = speed;
	}

	public void speedUp(int speed) {
		if (this.speed + speed > Car.MAX_SPEED) {
			this.speed = Car.MAX_SPEED;
		} else {
			this.speed += speed;
		}
		System.out.println("½ºÆ÷Ã÷Ä«ÀÇ spped : " + this.speed);
	}

	public void speedDown(int speed) {
		if (this.speed - speed < Car.MIN_SPEED) {
			this.speed = Car.MIN_SPEED;
		} else {
			this.speed -= speed;
		}
		System.out.println("½ºÆ÷Ã÷Ä«ÀÇ spped : " + this.speed);
	}

}
