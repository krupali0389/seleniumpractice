package ArrayExamples;

public class Example4 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		System.out.println("Array size" +arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("***************************");
		arr[0][0]=1;
		arr[0][1]=3;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
	}
	}
}

// 0-0,0-1,
// 1-0,1-1,
// 2-0,2-1,
