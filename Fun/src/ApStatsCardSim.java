import java.util.Random;

public class ApStatsCardSim {

	public static boolean sim(){
		int[] a = new int[6];
		Random r = new Random();
		boolean[] b = new boolean[4];
		for(int i = 0; i < b.length; i++){
			b[i] = false;
		}
		for(int i = 0; i < a.length; i++){
			int temp = r.nextInt(4);
			switch(temp){
			case 0:
				b[0] = true;
				break;
			case 1:
				b[1] = true;
				break;
			case 2:
				b[2] = true;
				break;
			case 3:
				b[3] = true;
				break;
			default:
				break;
			}
		}
		boolean check = true;
		for(int i = 0; i < b.length; i++){
			if(b[i] == false)
				check = false;
		}
		return check;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double count = 0;
		double total = 0;
		for(int i = 1; i < 1200; i++){
			if(sim()){
				count++;
			}
			total++;
		}
		System.out.println(count / total);
	}

}
