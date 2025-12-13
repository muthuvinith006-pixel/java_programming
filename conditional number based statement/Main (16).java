import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int a=sc.nextInt();
	     int b =sc.nextInt();
	     int n1=a%10;
	     int n2=b%10;
	    
	    if(n1==n2 ){
	       System.out.println(" same last digit number");
	    }
	   // else if(a%5==0){
	   //    System.out.println(" divisible");
	   // }
	    else{
		System.out.println(" not same last digit number");
	    }
	
}
}