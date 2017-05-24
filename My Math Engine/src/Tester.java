
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Term a = new Term(3,2);
		Term b = new Term(6,1);
		Term c = new Term(3,0);
		Term[] t = {a,b,c};
		Function f = new Function(t);
		System.out.println(f.getY(5));
		System.out.println(f.getDerivativeAt(5));
		System.out.println(f.getIntegralAt(5));
		System.out.println(f.getIntegralFrom(5, 3));
	}

}
