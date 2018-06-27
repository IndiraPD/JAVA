package assignment;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = Math.abs(n);
		if(x%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		s.close();

	}

}
