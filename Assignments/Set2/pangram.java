package prp;
import java.util.*;


public class Pangram {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count[] = new int[26];
		String s1 = str;
		str = str.toLowerCase().replaceAll(" ","");
		int n = str.length();
		for(int i=0;i<n;i++){
			count[str.charAt(i)-'a']++;
		}
		int flag=0;
		for(int i=0;i<26;i++){
			if(count[i]==0){
				System.out.println(s1+" is not a Pangram");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
			System.out.println(s1+" is a Pangram");
		s.close();
		
	}

}
