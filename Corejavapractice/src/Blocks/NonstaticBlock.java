package Blocks;

public class NonstaticBlock {

	{
		System.out.println("non static block");
	}
	
	 
	public static void main(String[] args) {
		
		NonstaticBlock e1=new NonstaticBlock();
		

	}

}
