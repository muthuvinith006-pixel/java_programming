import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    
	     int a=sc.nextInt();
	   //  int b=sc.nextInt();
	   //  int c=sc.nextInt();
	     if((a&1)==0){
	         System.out.println("Even");
	     }
	     
	   //  else if( b<c){
	   //       System.out.println(" b is smalltest number");
	   //  }
	     else{
	         System.out.println(" Odd");
	     }
	    
	
	   // System.out.println((a%10)/3);
	}
}