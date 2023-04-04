package ArrayAssignment;



public class CopyElements {

	public static void main(String[] args) {
		char copy[] = { 'a', 'b', 'd', 'e', 'f', 'g', 't' };
		
		char copyTo[] = Arrays.copyOf(copy, copy.length);
		System.out.println("Elements count in copyTo arrays:" + copyTo.length);
	}

}
