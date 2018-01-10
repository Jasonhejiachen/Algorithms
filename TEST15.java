package jichu;

public class TEST15 {

	public static void main(String[] args){
		int[] a = {1,1,2,3,1,7,5,3,2,2,2,2};
		int[] result = histogram(a,7);
		for(int i =0;i<result.length;i++){
			System.out.print(result[i]);
		}
	}
	
	public static int[] histogram(int[] a,int b){
		int[] result = new int[b];
		for(int i=0;i<a.length;i++){
			if(a[i]>=0&&a[i]<b){
				result[a[i]]++;
			}
		}
		
		return result;
		
	}
}
