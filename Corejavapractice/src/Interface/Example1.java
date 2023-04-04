package Interface;
 interface  I{
	abstract void show();
		 
	 }
	
 class D implements I{
	public void show(){
		System.out.println("draw method");
	}
}
 class Q implements I{
	 public void show(){
		 System.out.println("show method");
	 }
 }
public class Example1 {

	
	 
	 
	public static void main(String[] args) {
		//Q e1=new Q();
		//e1.show();
//D e2=new D();
//e2.show();
I e3=new D();
e3.show();
	}

}
