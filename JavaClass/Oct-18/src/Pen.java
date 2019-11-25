
abstract public class Pen {
	int cost;
	abstract void write();
	abstract void color();
	void open() {
		System.out.println("open");
	}
	void close() {
		System.out.println("close");
	}
}
