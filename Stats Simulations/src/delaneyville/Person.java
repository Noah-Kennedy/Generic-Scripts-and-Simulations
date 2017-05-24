package delaneyville;
import java.util.Random;

public class Person {
	public String gender;
	public int age;
	boolean dead;
	
	public Person(String g){
		gender = g;
		age = 0;
		dead = false;
	}
	
	public Person reproduce(){
			Random r = new Random();
			boolean b = r.nextBoolean();
			if(b) return new Person("m");
			else return new Person("f");
	}
	
	public void getDeath(){
		if(age > 72) dead = true;
	}
	
	public void age(){
		age++;
	}
	
	public boolean isFertile(){
		if((age > 18 || age < 72) && gender.equals("m") && !dead) return true;
		else return false;
	}
}
