package ThisKeyword;

public class ThisKeywordex1 {

	int age=12;
	double salary=1220f;
	void print( double salary){
		
		System.out.println(this.salary);
		
	}
	void show(int age){
		System.out.println(this.age);
	}
	 
	 
	public static void main(String[] args) {
		ThisKeywordex1 e1=new ThisKeywordex1();
		e1.print(13);
		e1.print(1235.0);
		e1.show(45);
		
		

	}

}
