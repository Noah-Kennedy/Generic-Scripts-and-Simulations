

public class Testcalcs {
	public static void main(String[] args){
		double d3 = .7083;
		double x;
		double theta;
		double angle;
		double dm;
		double dl = 4.03;
		double dr = 4.608;
		x = Math.acos(((dl*dl) - (dr*dr) - (d3*d3)) / (-2.0*dr*d3));
		dm = Math.sqrt((.5*d3)*(.5*d3) + dr*dr - d3*dr*Math.cos(x));
		theta = Math.asin(.5*d3*Math.sin(x)/dm);
		System.out.println("x: " + Math.toDegrees(x));
		angle = theta + x;
    	System.out.println("Angle: " + Math.toDegrees(angle));
    	System.out.println("dm: " + dm);
	}
	
}
