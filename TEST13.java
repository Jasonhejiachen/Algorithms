package jichu;

public class TEST13 {

	public static void main(String[] args){
		int[][] a = {{10,20,30},{40,50,60}};
		printTransposedMatrix(a);
	}

	private static void printTransposedMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int i=0;i<matrix[0].length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[j][i]);
			}
			System.out.println("");
		}
	}
}
