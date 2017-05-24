
public class Function {
	Term[] termList;
	Function[] chains;
	public Function(Term[] t){
		termList = t;
		chains = new Function[0];
	}
	public Function(Term[] t, Function[] c){
		termList = t;
		chains = c;
	}
	public Function getDerivative(){
		Term[] tl = new Term[termList.length - 1];
		for(int i = 0; i < tl.length; i++){
			tl[i] = termList[i].getDerivative();
		}
		return new Function(tl);
	}
	public Function getIntegral(){
		Term[] tl = new Term[termList.length + 1];
		for(int i = 0; i < termList.length; i++){
			tl[i] = termList[i].getIntegral();
		}
		tl[tl.length-1] = new Term(0,0);
		return new Function(tl);
	}
	public double getY(double x){
		double sum = 0;
		for(int i = 0; i < termList.length; i++){
			sum += termList[i].getY(x);
		}
		return sum;
	}
	public double getDerivativeAt(double x){
		return this.getDerivative().getY(x);
	}
	public double getIntegralAt(double x){
		return this.getIntegral().getY(x);
	}
	public double getIntegralFrom(double upper, double lower){
		return this.getIntegralAt(upper) - this.getIntegralAt(lower);
	}
	public Function multiply(Function f){
		int newLength = f.termList.length * this.termList.length;
		Term[] product = new Term[newLength];
		int counter = 0;
		for(int i = 0; i < this.termList.length; i++){
			for(int j = 0; j < f.termList.length; j++){
				product[counter] = this.termList[i].multiply(f.termList[j]);
				counter++;
			}
		}
		return new Function(product);
	}
	public Function multiplyByTerm(Term t){
		Term[] temp = new Term[termList.length];
		for(int i = 0; i < termList.length; i++){
			temp[i] = termList[i].multiply(t);
		}
		return new Function(temp);
	}
	public Function multiplyByConstant(double x){
		Term[] temp = new Term[termList.length];
		for(int i = 0; i < termList.length; i++){
			temp[i] = termList[i].multiplyByConstant(x);
		}
		return new Function(temp);
	}
	
}
