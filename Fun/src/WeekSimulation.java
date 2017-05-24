
public class WeekSimulation {
	int sampleSize;
	Week[] weekList;
	public WeekSimulation(int n){
		sampleSize = n;
		weekList = new Week[n];
	}
	public void calcWeeks(){
		for(int j = 0; j < weekList.length; j++){
			weekList[j] = new Week();
		}
	}
	public double getCountOfTrueWeeks(){
		double count = 0;
		for(int j = 0; j < weekList.length; j++){
			if(weekList[j].isFavSongPlayed() == true){
				count++;
			}
		}
		return count;
	}
	public double getObservedOdds(){
		return getCountOfTrueWeeks() / sampleSize;
	}
}
