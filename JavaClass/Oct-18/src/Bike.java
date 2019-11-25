
public class Bike implements Bus, Cycle {

	@Override
	public void move() {
		Cycle.super.move();
	}


}