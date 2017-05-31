package shootoutInValhalla;

public class Prob {
	public static double myst(int calls){
		if(calls > 0){
			return (1 / 3.0) * ((1 / 3.0) + myst(calls - 1));
		}else return 0;
	}
	public static void main(String[] args){
		System.out.println(myst(10000));
	}
}
