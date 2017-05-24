

public class Tester {
	public static int mystery(int k){
		if(k == 1) return 0;
		else return (1 + mystery(k/2));
	}
	public static void main(String[] args){
		System.out.println(mystery(-100));
	}
}