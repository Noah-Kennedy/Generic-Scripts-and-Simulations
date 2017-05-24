import javax.swing.JOptionPane;

public class Daddy {
	public static void main(String[] args){
		String s;
		while(true){
			s = JOptionPane.showInputDialog("Harder Daddy?");
			s = s.toLowerCase();
			if(s.equals("yes"))
				break;
		}
	}
}
