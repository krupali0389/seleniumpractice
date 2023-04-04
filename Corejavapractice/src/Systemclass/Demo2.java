package Systemclass;

public class Demo2 {
	public static void main(String[]args) {
		System.out.println("System User Dir: "+System.getProperty("user.home"));
		System.out.println("Current Working Dir: "+System.getProperty("user.dir"));
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));
		
	}

}
