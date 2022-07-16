package week1.day2;

import java.util.Arrays;

public class Solution11 {
	String str1 = "stop";
	String str2 = "post";

	
	  public static void main(String[] args) 
	  { String str1 = "stop"; 
	  String str2 =	  "post"; 
	  if (str1.length() ==str2.length()) 
	  { 
		  //char [] ch1 = new char[str1.length()]; 
		  //char [] ch2 = new char[str2.length()]; 
		  char [] ch1 = str1.toCharArray(); 
		  char [] ch2 = str2.toCharArray();
	  
	  //ch1[i] =str1.charAt(i);
	  
	  Arrays.sort(ch1); 
	  Arrays.sort(ch2);
	  if (Arrays.equals(ch1, ch2)) {
	  
	  System.out.println("is anagram" ); 
	  } 
	  //return true; 
	   else {
	  
	  System.out.println("not an anagram"); 
	  
	  } 
	 // return false;
	  
	  }
	 
	/*public static void isAnagram(String str1, String str2) {

		if (str1 == str2) {
			char[] ch1 = new char[str1.length()];
			char[] ch2 = new char[str2.length()];
			 char [] ch1 = str1.toCharArray();
			 char [] ch2 = str2.toCharArray();

			 ch1[i] =str1.charAt(i);

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (ch1 == ch2) {

				System.out.println("is anagram");
			}
			 //return true;
		} else {

			System.out.println("not an anagram");
		}
		 //return false;

	}*/
}
}
