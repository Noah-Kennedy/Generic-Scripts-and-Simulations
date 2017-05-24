import java.util.Random;

public class Week {
	int[] days;
	Random r;
	public Week(){
		days = new int[7];
		r = new Random();
		for(int i = 0; i < days.length; i++){
			days[i] = r.nextInt(7);
		}
	}
	public boolean isFavSongPlayed(){
		boolean check = false;
		for(int i = 0; i < days.length; i++){
			if(days[i] == 0){
				check = true;
			}
		}
		return check;
	}
}
