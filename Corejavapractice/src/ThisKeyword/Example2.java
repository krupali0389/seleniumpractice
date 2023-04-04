package ThisKeyword;

public class Example2 {

	int rollno;
	String name;
	float salary;
	void display(int rollno,String name,float salary){
		this.rollno=rollno;
		this.name=name;
		this.salary=salary;
			
		}
	void show(){
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(salary);
	}
	
	 
	 
	public static void main(String[] args) {
		 Example2 e1=new  Example2();
		 e1.display(12,"krupali" ,23647);
		 e1.show();
		

	}

}
