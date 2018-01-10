package jichu;

public class TEST11 {

	public static void printBooleanMatrix(boolean[][] matrix){
		
		
		for(int i =0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j] ? '*':' ');
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		boolean[][] a = {{true,false,true},{false,false,true},{true,false,false}};
		printBooleanMatrix(a);
	}
}
