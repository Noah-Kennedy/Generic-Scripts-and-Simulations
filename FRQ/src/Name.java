
public class Name {
	private String myName;
	
	public Name(String s){
		myName = s;
	}
	public int length(){
		return myName.length();
	}
	public String prefix(int k){
		if(myName.length() <= k)
			return myName;
		else
			return myName.substring(0, k);
	}
	public String suffix(int k){
		if(myName.length() <= k)
			return myName;
		else
			return myName.substring(myName.length()-k);
	}
	public static boolean isNickname(Name nick){
		if(!nick.suffix(2).equals("ie"))
			return false;
		else if(nick.prefix(nick.length()-2).equals("") || nick.prefix(nick.length()-2).equals(null))
			return false;
		else
			return true;
	}
	
	public static void main(String[] args){
		Name n = new Name("susie");
		System.out.println(isNickname(n));
	}
}
