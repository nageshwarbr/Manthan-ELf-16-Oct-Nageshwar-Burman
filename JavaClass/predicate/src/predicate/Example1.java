package predicate;

import java.util.function.Consumer;
import java.util.function.Function;

public class Example1 {
	
	public static void main(String[] args) {
	
		animal a=new cow();
		Consumer<animal> fn=al->{
			al.sound();
		};
		fn.accept(a);
	}
     
}
