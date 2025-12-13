import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int a=sc.nextInt();
	   //  int b =sc.nextInt();
	   //  int n1=a%10;
	   //  int n2=b%10;
	    
	    if(a>0 && a<9 ){
	       System.out.println(" single digit number");
	    }
	    else if(a>10 && a<99){
	       System.out.println(" double digit number");
	    }
	    else{
		System.out.println(" three digit numer");
	    }
	
}
}