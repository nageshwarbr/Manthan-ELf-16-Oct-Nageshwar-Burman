import java.util.function.Consumer;

public class Searchtrain {
public static void main(String[] args) {
	
	Trains raj=new Rajdhani();
	Trains sat=new Satabdi();
	Consumer<Trains> t=tr->tr.displayName();
	t.accept(raj);
	t.accept(sat);

	}
}
