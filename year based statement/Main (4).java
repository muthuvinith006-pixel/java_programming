import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	     int b=sc.nextInt();
	    int y1=a%10;
	    int y2=a%10;
	    if(y1==y2){
	        System.out.println("same");
	    }
	   // else if ( a%400==0){
	   //     System.out.println("leap year");
	   // }
	    else{
		    System.out.println("not same ");
	    }
	}
}
