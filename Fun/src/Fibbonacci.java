import javax.swing.JOptionPane;

public class Fibbonacci {
	public static void main(String[] args){
		int n = 1;
		int old = 0;
		int sum = 0;
		int u = Integer.parseInt(JOptionPane.showInputDialog("Enter an int"));
		
		for(int i = 1; i <= u; i++){
			sum = n + old;
			old = n;
			n = sum;
			System.out.println(sum);
		}
	}
}
