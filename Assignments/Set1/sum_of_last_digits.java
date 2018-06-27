package assignment;

import java.util.Scanner;

public class Summ {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		int n1 = s.nextInt();
		int x1 = Math.abs(n1);
		int n2 = s.nextInt();
		int x2 = Math.abs(n2);
		int sum = (x1%10) + (x2%10);
		System.out.println("sum of last digits:"+sum);
		
		s.close();
		
	}

}
