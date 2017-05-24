
public class Term {
	double n;
	double k;
	//form k * x^n
	public Term(double a, double r){
		n = r;
		k = a;
	}
	public double getY(double x){
		return k * Math.pow(x, n);
	}
	public Term getDerivative(){
		double n1 = n - 1;
		double k1 = k * n;
		return new Term(k1,n1);
	}
	public double getDerivativeAt(double x){
		return this.getDerivative().getY(x);
	}
	public Term getIntegral(){
		double k1 = k / (n + 1);
		double n1 = n + 1;
		return new Term(k1,n1);
	}
	public double getIntegralFromZeroAt(double x){
		return this.getIntegral().getY(x);
	}
	public double getIntegralFrom(double upper, double lower){
		return this.getIntegralFromZeroAt(upper)- this.getIntegralFromZeroAt(lower);
	}
	public Term multiply(Term t){
		double k1 = this.k * t.k;
		double n1 = this.n + t.n;
		return new Term(k1,n1);
	}
	public Term multiplyByConstant(double t){
		double k1 = this.k * t;
		return new Term(k1,this.n);
	}
	public Term add(Term t){
		if(t.n == this.n){
			double k1 = this.k + t.k;
			return new Term(k1,this.n);
		}else{
			return null;
		}
	}
}
