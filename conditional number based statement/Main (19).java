import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	   char ch = sc.next().charAt(0);
	   int n1 =(int)ch;
	    
	    if(n1%2==0){
	       System.out.println(" Even ");
	    }
	   // else if(a>10 && a<99){
	   //    System.out.println(" double digit number");
	   // }
	    else{
		System.out.println(" Odd");
	    }
	
}
}