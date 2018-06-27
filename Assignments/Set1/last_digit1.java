package assignment;

import java.util.Scanner;


public class Last_digit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int x = Math.abs(n);
		int l;
		l=x%10;
		System.out.println("last digit:"+l);
		
		s.close();
	
		
		


		

	}

}
