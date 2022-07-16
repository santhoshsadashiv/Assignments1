package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//String strWithOutDup = "";
		String[] str2 = text.split(" ");
		int count =0;
		for (int i = 0; i < str2.length; i++) {
			for (int j = i+1; j < str2.length; j++) {
				if (str2[i].equals(str2[j]))
				{
					count++;
					//System.out.println("the duplicate string is:" + str2[j]);
				}
				if (count>0) {
					str2[j] = "";
					count =0;
				}
				
			}
		}
		for (int j2 = 0; j2 < str2.length; j2++) {
			System.out.println(str2[j2]);
		}
	}

}
