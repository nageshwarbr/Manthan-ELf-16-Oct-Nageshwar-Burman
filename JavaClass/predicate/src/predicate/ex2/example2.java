package predicate.ex2;

import java.util.function.Function;

public class example2 {

	public static void main(String[] args) {
		
		Chips c=new Kurkure();
		Function<Chips, Chips> fn= cn->cn;
		Chips ch=fn.apply(c);
		ch.eat();
	}
	
	
}
