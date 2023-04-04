package ThisKeyword;

public class Example1 {

	int a;
	void display(int a){
		this.a=a;
	}
	void show(){
		System.out.println(a);
	}
	 
	
	public static void main(String[] args) {
		
		 Example1 e1=new Example1();
		 e1.display(12);
		 e1.show();
	}

}
