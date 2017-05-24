
public class WeidnerRNG {
	private int seed;
	
	public WeidnerRNG(int s){
		seed = s;
	}
	public int randInt(){
		int s = seed * 3;
		s %= 7;
		return s;
	}

}
