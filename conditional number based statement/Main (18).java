import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int a=sc.nextInt();
	    int b =sc.nextInt();
	    int n1=a*b;
	   //  int n2=b%10;
	    
	    if(n1>0){
	       System.out.println(" Positive ");
	    }
	   // else if(a>10 && a<99){
	   //    System.out.println(" double digit number");
	   // }
	    else{
		System.out.println(" negative ");
	    }
	
}
}