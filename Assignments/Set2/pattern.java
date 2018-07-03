package guvi;
import java.util.Scanner;


public class Pattern {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
            
            int x=i,y=n;
            for(int j=i;j<=n;j++) {
                System.out.print(x+" ");
                x=x+y;
                y--;
            }
            
            System.out.println( );
        }
        
        
        s.close();
    }

}

