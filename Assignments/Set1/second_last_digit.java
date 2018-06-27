package assignment;

import java.util.Scanner;


public class Last_digit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int x = Math.abs(n);
		int l,second_last;
		l=x%100;
		second_last = l/10;

		if(n<10) {
			System.out.println(-1);
		}
		else {
			System.out.println("second last digit:"+second_last);
		}
		
		s.close();
	
		
		


		

	}

}
