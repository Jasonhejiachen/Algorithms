package jichu;

public class TEST22 {

	public static int rank(int key,int[] a){
		return rank(key,a,0,a.length-1,1);
	}
	public static int rank(int key,int[] a,int lo,int hi,int cs){
		if(lo > hi) return -1;
		int mid = lo + (hi - lo)/2;
		if(key<a[mid]){
			cs++;return rank(key,a,lo,mid-1,cs);	
		} 
		if(key>a[mid]){
			cs++;return rank(key,a,mid+1,hi,cs);
		} 
		else return cs;
	}
	public static void main(String[] args){
		int[] sz = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i =0;i<=20;i++)
			System.out.println(rank(i,sz));
	}
}
