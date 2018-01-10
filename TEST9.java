package jichu;

import java.util.Scanner;

public class TEST9 {

	public static void main(String[] args){
		String s ="";
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int n = N;n>0;n/=2){
			s = (n%2) +s;
			System.out.println(s);
		}
	}
}
