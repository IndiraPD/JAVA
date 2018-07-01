package prp;
import java.util.Scanner;


public class Password {

	public static void main(String[] args) {
		
		int count=0,count1=0,count2=0,flag=0,flag1=0,flag2=0;
		Scanner s = new Scanner(System.in);
		String pwrd = s.nextLine();
		char ch[] = pwrd.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65 && ch[i]<=90){
				count=1;
				}
			if(ch[i]>=97 && ch[i]<=122){
				count1=1;
			}
			if(ch[i]=='!' || ch[i]=='@' || ch[i]=='#' || ch[i]=='$' || ch[i]=='%' || ch[i]=='^' || ch[i]=='&' || ch[i]=='*' || ch[i]=='(' || ch[i]==')' || ch[i]=='-' || ch[i]=='+'){
				count2=1;
			}
			if(ch.length>=8){
				flag=1;
			}
			if(ch.length==6){
				flag1=1;
			}
			if(ch[i]>=48 && ch[i]<=57){
				flag2=1;
			}
			
		}
		if(count==1 && count1==1 && count2==1 && flag==1 && flag2==1){
			System.out.println("strong");
		}
		else if(count==1 && count1==1 && count2==1 && flag1==1){
			System.out.println("moderate");
		}
		else{
			System.out.println("week");
		}
		
		s.close();

	}

}
