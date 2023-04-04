package Constructor;

public class Addition {

	Addition(int a,int b){
		System.out.println(a+b);
	}
	Addition(int a,double b){
		System.out.println(a*b);
	}
	 
	 
	public static void main(String[] args) {
		Addition e1=new Addition(3,4);
		Addition c1=new Addition(3,4.0);
		

	}

}
