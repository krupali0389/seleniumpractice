package Constructor;

public class demo1 {

	demo1(){
		System.out.println("zero para");
	}
	demo1(int a,int b){
		System.out.println("multi para");
	}
	demo1(int a){
		System.out.println("single para");
	}
	
	 
	public static void main(String[] args) {
		demo1 e1=new demo1();
		demo1 c1=new demo1(1,2);
		demo1 d1=new demo1(2);
		
	

	}

}
