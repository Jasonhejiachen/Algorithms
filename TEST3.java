package jichu;

public class TEST3 {

	public static void main(String[] args){
		String a = args[0];
		String b = args[1];
		String c = args[2];
		if (a.equals(b)&&a.equals(c)&&b.equals(c)){
			System.out.println("equals");
		}else{
			System.out.println("not equals");
		}
		
	}
}
