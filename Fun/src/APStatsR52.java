import java.util.Arrays;
import java.util.Random;

public class APStatsR52 {
	static boolean sim(int sample){
		Random r = new Random();
		boolean[] b = new boolean[sample];
		for(int i = 0; i < sample; i++){
			if(r.nextDouble() > .85){
				b[i] = true;
			}else{
				b[i] = false;
			}
		}
		//System.out.println(Arrays.toString(b));
		boolean check = false;
		for(int i = 1; i < sample; i++){
			if(b[i] == true && b[i-1] == true)
				check = true;
		}
		return check;
	}
	public static void main(String[] args){
		double count = 0;
		double total = 0;
		for(int i = 1; i <= 1000000; i++){
			if(sim(10)){
				count++;
			}
			total++;
		}
		System.out.println(count / total);
	}
}
