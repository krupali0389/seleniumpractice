package Assignment;
import java.util.*;
public class UniqueElement {

	public static void main(String[] args) {
		// WAP to get unique elements
		int arr[]= {1,2,3,5,4,2,1,4,};


int n = arr.length;
      int i, j;
      System.out.print("The array is: ");
      for (i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
      System.out.print("The distinct elements of above array are: ");
      for (i = 0; i < n; i++) {
         for (j = 0; j < i; j++)
         if (arr[i] == arr[j])
            break;
         if (i == j)
         System.out.print( arr[i] + " ");
      }
   }
	

				}
			
			
		
		
		
		

	




