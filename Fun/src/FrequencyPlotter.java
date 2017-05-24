import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class FrequencyPlotter {
	public static void main(String[] args){
		int l = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of points"));
		int a[] = new int[l];
		ArrayList<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < l; i++){
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a data point"));
			if(values.contains(a[i]) == false){
				values.add(a[i]);
			}
			System.out.println(a[i]);
		}
		values.sort(null);
		for(int i = 0; i < values.size(); i++){
			System.out.print(values.get(i) + " ");
			for(int j = 0; j < a.length; j++){
				if(a[j] == values.get(i)){
					System.out.print("X");
				}
			}
			System.out.println();
		}
		// test case System.out.println(values.toString());
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
	}
}

