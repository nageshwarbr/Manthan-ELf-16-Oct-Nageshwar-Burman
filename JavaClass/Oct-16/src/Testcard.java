
public class Testcard {
public static void main(String[] args) {
	Card c=new Card();
	Card v=new Card();
	Card o=new Card();
	c.swipe();
	v.swipe();
	o.swipe();
	System.out.println(Card.orgCount);
	System.out.println(o.count);
	System.out.println(v.count);
	System.out.println(c.count);
}
}
