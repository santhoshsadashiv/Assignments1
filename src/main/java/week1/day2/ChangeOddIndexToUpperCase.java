package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		String str = "";
		char[] chars = test.toCharArray();
		//System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
		
		if (i % 2 != 0 && Character.isLowerCase(chars[i]))
		{
			char upperCase = Character.toUpperCase(chars[i]);
			str = str+upperCase;
			System.out.println(str);
		}
		else {
			str = str + chars[i];
			System.out.println(str);
		}
		}
	}

}
