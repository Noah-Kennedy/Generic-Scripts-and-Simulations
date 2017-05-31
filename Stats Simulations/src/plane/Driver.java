package plane;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		Person[] p = new Person[99];
		boolean[] b = new boolean[100];
		ArrayList<Person> e = new ArrayList<Person>();

		for(int i = 0; i < p.length; i++){
			p[i] = new Person(i);
		}
		Person w = new Person((int) (Math.random() * 100));
		b[w.getSeat()] = true;

		System.out.println(w + " " + Arrays.toString(p));
		for(int i = 0; i < p.length; i++){
			if(b[p[i].getSeat()]){
				p[i].setSeat((int) (Math.random() * 100));
				i--;
				//i--;
				e.add(p[i]);
			}else{
				b[i] = true;
			}
		}
		
		System.out.println(w + " " + e + " " + Arrays.toString(p));

	}

}
