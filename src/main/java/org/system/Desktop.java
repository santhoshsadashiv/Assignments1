package org.system;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.desktopSize(13);
	}


	public void desktopSize(int y) {
		System.out.println("Size of the computer is " +y);
		computerModel(81131);	

	}
}
