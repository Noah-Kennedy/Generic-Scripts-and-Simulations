package delaneyville;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args){
		ArrayList<Person> p = new ArrayList<Person>();
		
		double males = 0;
		double females = 0;
		
		p.add(new Person("m"));
		p.add(new Person("f"));

		for(int i = 0; i < 15; i++){
			ArrayList<Person> temp = new ArrayList<Person>();
			for(Person person : p){
				if(person.isFertile()) temp.add(person.reproduce());
				person.age();
				person.getDeath();
			}
			for(Person pe : temp) p.add(pe);
		}
		
		for(Person pl : p){
			if(!pl.dead && pl.gender.equals("m")) males++;
			else if(!pl.dead && pl.gender.equals("f")) females++;
		}
		
		System.out.println(males / females);
		System.out.println(males);
		System.out.println(females);
	}
}
