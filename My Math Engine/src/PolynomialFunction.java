

public class PolynomialFunction {
	double[] constants;
	public PolynomialFunction(double[] c){
		constants = c;
	}
	public int getTerms(){
		return constants.length;
	}
	public double getY(double x){
		double y;
		double sum = 0;
		for(int i = 0; i < constants.length; i++){
			sum += getTerm(x,i);
		}
		y = sum;
		return y;
	}
	public PolynomialFunction getDerivative(){
		double[] k = new double[constants.length - 1];
		int n = constants.length;
		for(int i = 0; i < k.length; i++){
			k[i] = constants[i] * (n - i-1);
		}
		return new PolynomialFunction(k);
	}
	public PolynomialFunction getIntegralFromZero(){
		int n = constants.length;
		double[] k = new double[constants.length + 1];
		for(int i = 0; i < constants.length; i++){
			k[i] = constants[i] / (n - i + 1-1);
		}
		k[k.length - 1] = 0;
		return new PolynomialFunction(k);
	}
	public double getIntegral(double lowerBound, double upperBound){
		double val;
		val = this.getIntegralFromZero().getY(upperBound) - this.getIntegralFromZero().getY(lowerBound);
		return val;
	}
	public double getTerm(double x, int t){
		//terms start at zero, not one
		int n = constants.length;
		double k = constants[t];
		double expVal = Math.pow(x, n-t-1);
		return k * expVal;
	}
}
