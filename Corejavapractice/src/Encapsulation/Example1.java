package Encapsulation;
class Encademo{
	private int a;
	private int age;
	public int geta() {
		return a;
		
	}
	public void seta(int a) {
		this.a=a;
	}
	public int getage() {
		return age;
		
	}
	public void setage(int age) {
		this.age=age;
	}
}
public class Example1 {
	public static void main(String[]args) {
		Encademo e1=new Encademo();
		System.out.println(e1.geta());
		System.out.println(e1.getage());
		System.out.println("************************");
		e1.seta(12);
		e1.setage(34);
		System.out.println("employee:" +e1.geta());
		System.out.println("employee age:"+e1.getage());
		
		
	}

}
