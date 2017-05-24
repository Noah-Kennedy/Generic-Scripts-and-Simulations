import java.util.Random;

import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args){
		Random r = new Random();
		for(int i = 1; i < 1000000; i++){
			System.out.println(r.nextDouble());
		}
	}
}
