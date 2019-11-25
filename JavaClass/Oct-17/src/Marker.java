
public class Marker extends Pen{
	Marker(){
		this(2);
		//super(); calls parent class zero parameterized constructor
		System.out.println("B");
	}
	Marker(int r){
		super(7);
		System.out.println("N");
	}
	Marker(double t){
		super(2);
		System.out.println("I");
	}
}

