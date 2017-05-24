
public class P$4 {
	public static void main(String[] args){
		int[] a = {1,2,3,3,3,3,4,2,2,2,2,2,2,2,5,6,6,6,6,6,6,4,7,8};
		int index = 0;
		int soFar = 1;
		int count = 1;
		for(int k = 1; k < a.length; k++){
			if(a[k] == a[k-1]){
				count++;
				
				if(count > soFar){
					soFar = count;
					index = k;
				}
			}else{
				count = 1;
			}
		}
		System.out.println(a[index]);
	}
}
