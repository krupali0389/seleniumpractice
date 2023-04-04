package ThisKeyword;

public class ThisStatement {
	ThisStatement(){
		System.out.println("zero para");
	}
	ThisStatement(int a){
		this();
		System.out.println("single para");
		
	}
	ThisStatement(int a,double d){
		this(12);
		System.out.println("double para");
	}
	 
	 
	public static void main(String[] args) {
		ThisStatement e1=new ThisStatement(12,4.0);
		
		
	
			
		

	}

}
