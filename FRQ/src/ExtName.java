
public class ExtName extends Name{
	private int num;

	public ExtName(String s, int n) {
		super(s);
		num = n;
	}
	
	public int getNum(){
		int temp = num;
		return temp;
	}

}
