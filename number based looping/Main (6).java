 import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    int rev =0;
	    int org =n;
	    while(n/7==0){
	      int d=n%10;
	      rev=rev*10+d;
	      n=n/10;
	    }
	 
	  	     System.out.println(rev);
	  	     
	  	     if(org==rev){
	  	         System.out.println("palindrome");
	  	     }
	  	     else{
	  	         System.out.println("not palindrome");
	  	     }

	}

}