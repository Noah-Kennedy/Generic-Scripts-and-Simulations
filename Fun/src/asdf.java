
public class asdf {
	public static void main(String[] args){
		String bookName = "Java Concepts for AP Computer Science";
		String newWord = bookName.substring(18) + bookName.substring(4, 18) + bookName.substring(0,4);
		System.out.println(bookName.indexOf("cat"));
		System.out.println(newWord);
	}
}
