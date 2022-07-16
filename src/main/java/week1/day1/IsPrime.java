package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 124;
		boolean isPrime = false;
		
		for (int i=2; i<n; i++) {
		if (n % i != 0  ) {
			isPrime = true;			
		}
		else {
			isPrime = false;
			break;
		}
		}
		
		if (isPrime)
		{
			System.out.println(+n+" number is prime");
			
		}
		else {
			System.out.println(+n+" number is not prime");
		}
		
		}

	

}
