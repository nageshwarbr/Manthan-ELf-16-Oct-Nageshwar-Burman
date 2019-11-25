
public class TestGen {
public static void main(String[] args) {
	thirdgen thirdGen=new thirdgen();
	thirdGen.cost=45;
	thirdGen.call();
	thirdGen.camera();
	thirdGen.msg();
	Secondgen secondgen=new Secondgen();
	//secondgen.camera();
	secondgen.radio();
	secondgen.call();
	secondgen.msg();
}
}
