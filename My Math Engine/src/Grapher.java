import java.awt.Point;

public class Grapher extends Canvas{
	private double xOrigin;
	private double yOrigin;
	private double scale;
	public Grapher(double limit, int size){
		super();
		this.setSize(size, size);
		xOrigin = size / 2;
		yOrigin = size / 2;
		//scale = 
		this.setVisible(true);
	}
	
	public void Graph(int x, int y){
		Point temp = new Point();
		int x1 = (int) (x - xOrigin);
		int y1 = (int) (y - yOrigin);
		temp.setLocation(x1, y1);
		System.out.println(scale);
		this.drawPoint(temp);
	}
	
}
