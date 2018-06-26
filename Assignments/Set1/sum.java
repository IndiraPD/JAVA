package guvi;

import java.util.Scanner;

class Summmm {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum=6;
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i] = s.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
				{
					if((arr[i]+arr[j])== sum)
					{
						System.out.println(arr[i] +" "+ arr[j]);
					}
				}
		}
		s.close();
	}

}
