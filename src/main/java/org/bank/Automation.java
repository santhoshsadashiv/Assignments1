package org.bank;

public class Automation extends MultipleLangauge  implements Language,TestTool {

	public static void main(String[] args) {
		
	}

	public void Java() {
		System.out.println("implementing this in automation class");	
	}
	
	public void python() {
		System.out.println("overriding in automation class");
	}
	
	public void ruby() {
		System.out.println(" implementing ruby method in automation class");
	}

	public void Selenium() {
		System.out.println(" implementing selenium method in automation class");
	}

}
