package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String Str1 = "World";
		char [] chars = Str1.toCharArray();
		System.out.println("Characters length is: " +chars.length);
		for(int i =chars.length-1; i >=0; i--) {
			System.out.println(chars[i]);
		}
	}

}
