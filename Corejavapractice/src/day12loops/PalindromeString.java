package day12loops;

public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     String ch ="Ishani";
     String a="";
     System.out.println(ch.length());
     for(int i=ch.length()-1;i>=0;i--){
    	 a=a+ch.charAt(i);
    	 
     }
    	System.out.println(a); 

	}

}
