import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	   char ch = sc.next().charAt(0);
	   
	    
	    if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch =='U' ){
	       System.out.println(" vowels");
	    }
	   // else if(a>10 && a<99){
	   //    System.out.println(" double digit number");
	   // }
	    else{
		System.out.println(" Odd");
	    }
	
}
}