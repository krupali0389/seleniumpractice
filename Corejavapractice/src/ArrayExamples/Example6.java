package ArrayExamples;

public class Example6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];// 3 row and 3 column
		System.out.println("Array Size: " + arr.length);//row count
		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr[i].length; j++) {// cell count on current row
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
