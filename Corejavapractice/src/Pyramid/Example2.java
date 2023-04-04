package Pyramid;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {               //i=1
			for(int j=3;j>=i;j--) {           //j=1
			                                   //k=2
			
			System.out.print(" "); }
			for(int k=1;k<=i;k++) {
				System.out.print("*");                //#  #  #  *
			}
			System.out.println();	                  //
		}
		
	}

}

