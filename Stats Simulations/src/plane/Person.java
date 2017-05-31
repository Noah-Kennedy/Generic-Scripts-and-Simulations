package plane;

public class Person {
	private int seat;
	private int id;
	public static int people = 0;
	public Person(int s){
		setSeat(s);
		setId(people);
		people++;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return id + " " + seat;
	}
}
