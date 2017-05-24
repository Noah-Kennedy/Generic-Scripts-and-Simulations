
public class Flyting {
	public static void main(String[] args){
		String[] glorious = new String[3];
		glorious[0] = "I";
		glorious[1] = "am";
		glorious[2] = "glorious";
		String g = "";
		Canvas mc = new Canvas();
		mc.setSize(900, 900);
		for(int i = 0; i < 3; i++){
			g += glorious[i];
			System.out.print(glorious[i]);
			if(i == 2){
				System.out.println();
			}else{
				System.out.print(" ");
				g += " ";
			}
		}
		mc.drawString(g, 450, 450);
		mc.setVisible(true);
		String[] best = new String[4];
		best[0] = "I";
		best[1] = "am";
		best[2] = "the";
		best[3] = "best";
		String b = "";
		for(int i = 0; i < best.length; i++){
			b += best[i];
			System.out.print(best[i]);
			if(i == 3){
				System.out.println();
			}else{
				System.out.print(" ");
				b += " ";
			}
		}
		mc.drawString(b, 450, 400);
	}
}
