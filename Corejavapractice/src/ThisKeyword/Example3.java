package ThisKeyword;

public class Example3 {

	
	 int age;
	 void display(int empid){
		 age=empid;
	 }
	 void show(){
		 System.out.println(age);
	 }
	
	public static void main(String[] args) {
	
		Example3 e1=new Example3();
		e1.display(234);
		e1.show();
	}

}
