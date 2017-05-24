import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

public class Seizure {
	public static void main(String[] args){
		Random r = new Random();
		JFrame n = new JFrame();
		n.setSize(1080, 720);
		n.setDefaultCloseOperation(n.EXIT_ON_CLOSE);
		while(true){
			int i = r.nextInt(6)+1;
			if(i == 1){
				n.getContentPane().setBackground(Color.BLUE);
			}
			if(i == 2){
				n.getContentPane().setBackground(Color.CYAN);
			}
			if(i == 3){
				n.getContentPane().setBackground(Color.MAGENTA);
			}
			if(i == 4){
				n.getContentPane().setBackground(Color.ORANGE);
			}
			if(i == 5){
				n.getContentPane().setBackground(Color.RED);
			}
			if(i == 6){
				n.getContentPane().setBackground(Color.PINK);
			}
			n.setVisible(true);
		}
	}
}
