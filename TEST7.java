package jichu;

public class TEST7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumb = 0;
		for(int i =1;i<1000;i++)
			for(int j=0;j<i;j++)
				sumb++;
		System.out.println("b: " + sumb);
		
		int sumc =0;
		for(int i = 1;i<1000;i*=2)
			for(int j =0;j<1000;j++)
				sumc++;
		System.out.println("c: "+ sumc);
		
		
		
	}

}
