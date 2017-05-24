
public class GraphTester {
	public static void main(String[] args){
		Grapher g = new Grapher(500,1000);
		for(int i = 1; i < 500; i++){
			g.Graph(i, i);
		}
	}
}
