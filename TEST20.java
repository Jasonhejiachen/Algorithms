package jichu;

import java.util.Scanner;

public class TEST20 {

	public static double ln(int N){
		if(N<=1){
			return 1;
		}else{
			return N * ln(N - 1);
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(ln(a));
	}
}
