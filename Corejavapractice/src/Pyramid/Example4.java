package Pyramid;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {         //i=2
			for(int j=3;j>=i;j--) {       //j=1
				System.out.print(" ");  //k=1    # # # *
				                            //   # # * *
			}                               //   # * * *
			for(int k=1;k<=i;k++) {         //   * * * *
				System.out.print("*");
			}
			for(int s=2;s<=i;s++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
