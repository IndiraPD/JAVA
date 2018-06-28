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
		if(a>b){
			System.out.println(a);
		}
		else if(b>a){
			System.out.println(b);
		}
		s.close();
	}
}
