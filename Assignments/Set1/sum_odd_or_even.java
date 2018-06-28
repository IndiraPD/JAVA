import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		if(sum%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
		s.close();
	}
}
