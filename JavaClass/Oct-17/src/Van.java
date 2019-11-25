
public class Van {
	Van(){
		System.out.println("Zero parameterised");
	}
	//constructors can never be static
	Van(int a){
		System.out.println("int parameterized");
	}
	Van(double a){
		System.out.println("double parameterized");
	}
	Van(int a,int b){
		System.out.println("int,int parameterized");
	}

}
