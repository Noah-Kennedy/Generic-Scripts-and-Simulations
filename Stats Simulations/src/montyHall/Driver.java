package montyHall;

import java.util.Arrays;
import java.util.Random;


public class Driver {
	private static Random r = new Random();

	private static int getRandFalse(boolean[] b){
		while(true){
			int c = r.nextInt(b.length);
			if(!b[c]) return c;
			else return getRandFalse(b);
		}
	}
	
	private static int getFirstFalse(boolean[] b){
		for(int i = 0; i < b.length; i++){
			if(b[i]) return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		double wins = 0;
		int choose;
		int show;
		int ans;
		boolean[] b = {false,false,false};
		for (int i = 0; i < 1000; i++) {
			ans = r.nextInt(3);
			b[ans] = true;
			choose = r.nextInt(3);
			b[choose] = true;
			System.out.println("First " + Arrays.toString(b));
			show = getRandFalse(b);
			b[ans] = false;
			b[show] = true;
			System.out.println("Second " + Arrays.toString(b));
			choose = getFirstFalse(b);
			if(choose == ans) wins++;
		}
		
		System.out.println(wins / 1000);
	}
}
