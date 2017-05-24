
public class Rectangle {
	int width;
	int length;
	public Rectangle(){
		width = 5;
		length = 4;
	}
	public Rectangle(int wid, int len){
		width = wid;
		length = len;
	}
	public void setWidth(int w){
		width = w;
	}
	public int getWidth(){
		return width;
	}
	public int getArea(){
		return width * length;
	}
	public int getPerimeter(){
		return 2 * width + 2 * length;
	}
}
