package StringEx;

public class Example3 {

public static void main(String[]args) {
	String s="javapoint corejava";
	String s1=s.substring(0,1).toUpperCase();
String s2=s.substring(1);
String c1=s.substring(10, 11).toUpperCase();
String c2=s.substring(11);

String s3=s1+s2;
System.out.println(s3);

}
}
