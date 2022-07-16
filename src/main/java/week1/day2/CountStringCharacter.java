package week1.day2;

public class CountStringCharacter {

	public static void main(String[] args) {
		String str = "i am a software tester";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			int count =1;
			char ch = str.charAt(i);
			for (int j = i+1; j <str.length() ; j++) {
				if (ch == str.charAt(j) && !str2.contains(Character.toString(ch))) {
					count++;
				}
			}
			if(count>1)
			{
				str2 = str2 + ch;
				System.out.println(ch + " - " + count);
			}

		}


	}

}
