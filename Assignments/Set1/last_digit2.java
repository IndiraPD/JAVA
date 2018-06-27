package assignment;

import java.util.Scanner;

public class Last {
	
	public static int last_digit(int num) {
		
		return num%10;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int num = n>0 ? n : -n;
		System.out.println("last digit:"+last_digit(num));
		
		s.close();

	}

}
