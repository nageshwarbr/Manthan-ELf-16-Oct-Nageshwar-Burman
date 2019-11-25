
public class TestA {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.cost=100;
		p.write();
		System.out.println("Cost is "+p.cost);
		Van van=new Van();
		van.cost=100;
		van.model="Alto";
		van.move();
		van.stop();
		System.out.println("cost is "+van.cost+" and model is "+van.model);
		Person per=new Person();
		per.name="Raj";
		per.age=15;
		per.walk();
		per.eat();
		System.out.println("name is "+per.name+" and age is "+per.age);
	}
}
