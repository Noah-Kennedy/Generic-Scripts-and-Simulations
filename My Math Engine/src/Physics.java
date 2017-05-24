import java.awt.Color;
import java.awt.Point;

public class Physics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Term ay0 = new Term(.000025,0);
		Term[] ayList = {ay0};
		Function ay = new Function(ayList);
		Function vy = ay.getIntegral();
		Function xy = vy.getIntegral();
		
		Term ax0 = new Term(.0000025,0);
		Term[] axList = {ax0};
		Function ax = new Function(axList);
		Function vx = ax.getIntegral();
		Function xx = vx.getIntegral();
		Canvas mc = new Canvas("PhysicsSim");
		mc.setSize(1000, 1000);
		int t = 0;
		mc.setVisible(true);
		mc.setInkColor(Color.blue);
		while(t < 1000){
			int y1 = (int) xy.getY(t);
			if(y1 > 1000){
				y1 = 1000;
			}
			int x1 = (int) xx.getY(t);
			if(x1 > 1000){
				x1 = 1000;
			}
			Point p = new Point(x1,y1);
			mc.drawPoint(p);
			//mc.setVisible(true);
			System.out.println(x1);
			System.out.println(y1);
			t++;
		}
	}

}
