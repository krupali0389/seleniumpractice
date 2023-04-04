package Methods;

public class MethodOverloadingEx1 {

	
	 
	
	public static void main(String[] args) {
		Add(12,10);
		Add(3,5,4);
        Add(4.5,1);
        Add(2,1.0);
	}
	static void Add(int a,int b){
		System.out.println(a+b);
	}
	static void Add(int b,int a,int c){
		System.out.println(a*b*c);
	}
	static void Add(double a,int b){
		System.out.println(a-b);
	}
	static void Add(int a,double b){
		System.out.println(a/b);
	}

}
