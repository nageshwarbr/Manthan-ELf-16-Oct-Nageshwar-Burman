package abstraction;

public class TestFile {
public static void main(String[] args) {
	Google gd=new GDrive();
	Google gm=new Gmail();
	Browser b=new Browser();
	b.output(gm);
	b.output(gd);
}
}
