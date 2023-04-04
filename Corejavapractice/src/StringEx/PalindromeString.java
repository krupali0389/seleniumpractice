package StringEx;

public class PalindromeString {

	public static void main(String[] args) {
		// TO check if string is palindrome or not
		String s="Ishani";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);}
		System.out.println(rev);//for reverse the string
		
				//if(s.equals(rev)) {                                     //for palindrome
					//System.out.println("string is palindrome");}
			//else {
			//	System.out.println("string is not palindrome");
				}
}
			

		

	


