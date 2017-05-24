import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Statistics {
	public static double getAverage(int[] a){
		double sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		double average = sum / a.length;
		return average;
	}
	
	public static double getAverage(double[] a){
		double sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		double average = sum / a.length;
		return average;
	}
	
	public static void printFrequencyPlot(int[] a){
		int l = a.length;
		ArrayList<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < l; i++){
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
	public static void printFrequencyPlot(double[] a){
		int l = a.length;
		ArrayList<Double> values = new ArrayList<Double>();
		for(int i = 0; i < l; i++){
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
	public static double getStandardDeviation(int[] a){
		int sum = 0;
		double average = Statistics.getAverage(a);
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		//double d = sum;
		average = sum / a.length;
		double sumD = 0;
		for(int i = 0; i < a.length; i++){
			sumD += Math.pow(a[i] - average, 2);
		}
		double s = Math.sqrt(sumD / (a.length - 1));
		return s;
	}
	
	public static double getStandardDeviation(double[] a){
		double sum = 0;
		double average = Statistics.getAverage(a);
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		//double d = sum;
		average = sum / a.length;
		double sumD = 0;
		for(int i = 0; i < a.length; i++){
			sumD += Math.pow(a[i] - average, 2);
		}
		double s = Math.sqrt(sumD / (a.length - 1));
		return s;
	}
}
