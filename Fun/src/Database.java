

import java.util.Arrays;
import java.util.Random;

public class Database {
	public static void main(String[] args){
		int[] database = new int[2048];
		Random r = new Random();
		for(int i = 0; i < 2048; i++){
			int rng = r.nextInt(100);
			//System.out.println(database[i]);
		}
		System.out.println(Arrays.toString(database));
		Arrays.sort(database);
		System.out.println(Arrays.toString(database));
		int zero = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 0)
				zero++;
			}
		int one = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 1)
				one++;
			
		}
		int two = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 2)
				two++;
		}
		int three = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 3)
				three++;
		}
		int four = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 4)
				four++;
		}
		int five = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 5)
				five++;
		}
		int six = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 6)
				six++;
		}
		int seven = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 7)
				seven++;
		}
		int eight = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 8)
				eight++;
		}
		int nine = 0;
		for(int i = 0; i < 2048; i++){
			if(database[i] == 9)
				nine++;
		}
		System.out.println("0: " + zero);
		System.out.println("1: " + one);
		System.out.println("2: " + two);
		System.out.println("3: " + three);
		System.out.println("4: " + four);
		System.out.println("5: " + five);
		System.out.println("6: " + six);
		System.out.println("7: " + seven);
		System.out.println("8: " + eight);
		System.out.println("9: " + nine);

	}
}