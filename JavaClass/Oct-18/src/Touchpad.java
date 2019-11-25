
public class Touchpad implements Mouse, Keyboard {

	@Override
	public void press() {
		System.out.println("Key-press");
	}

	@Override
	public void click() {
		System.out.println("mouse click");
	}

}
