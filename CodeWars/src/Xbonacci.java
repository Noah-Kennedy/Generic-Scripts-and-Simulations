import java.util.Arrays;

public class Xbonacci {
	private static double[] tribonacci(double[] s, int n) {
		// hackonacci me
		double[] ret = new double[n];
		for (int i = 0; i < s.length; i++) {
			ret[i] = s[i];
		}

		for (int i = s.length; i < ret.length; i++) {
			ret[i] = ret[i - 1] + ret[i - 2] + ret[i - 3];
		}

		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d = {17,5,13};
		System.out.println(Arrays.toString(tribonacci(d,27)));
	}

}
