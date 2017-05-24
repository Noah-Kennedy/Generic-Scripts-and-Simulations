
public class Cat {
	int numberOfClaws;
	int numberOfEyes;
	String sharpnessOfClaws;
	
	public Cat(){
		numberOfClaws = 4;
		numberOfEyes = 2;
		sharpnessOfClaws = "very sharp";
	}
	public String getSharness(){
		return sharpnessOfClaws;
	}

	public int getClaws(){
		return numberOfClaws;
	}
	public void setSharpness(String s){
		sharpnessOfClaws = s;
	}

	public void setClaws(int a){
		numberOfClaws = a;
	}
}
