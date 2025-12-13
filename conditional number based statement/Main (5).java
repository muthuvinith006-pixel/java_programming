import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     if(a>b && a>c){
	         System.out.println("a is greatertest number");
	     }
	     
	     else if( b>c){
	          System.out.println(" b is greatertest number");
	     }
	     else{
	         System.out.println(" c is greatertest number");
	     }
	    
	
	}
}