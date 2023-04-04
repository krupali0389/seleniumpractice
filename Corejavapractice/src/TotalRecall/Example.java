package TotalRecall;

public class Example {

	static int a = 10;
	int b = 20;
	static void add(int a,int b){  //static method
		int res=a+b;
		System.out.println(res);
	}
	
	int multi(int x,int y){       // nonstatic method
		System.out.println(x*y);
		return x*y;
	}
	Example(){                              // user define constructor
		System.out.println("zero para");
	}
	Example(int a){                             //single para constructor
		this();
		System.out.println("single para");
	}
	static void add(double y,int z){              // static method
		System.out.println(y+z);
	}
	

	public static void main(String[] args) {
		System.out.println(a); //global static call

		Example e1 = new Example();// non static call
		System.out.println(e1.b);
		add(12,5); //method call
		 Example e2=new  Example();
			 e2.multi(2,5);// non static method call
			 Example e3=new Example(12); //constructor call
			 add(2.0,3); // method call
		

	}

}
