package Assignment;

public class DuplicateElement {

	public static void main(String[] args) {
		// WAP to get duplicate elements from list
		int arr[]= {1,2,3,4,5,1,4};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				System.out.println("Duplicate element :"+arr[i]);
			}
			
		}

	}

}
