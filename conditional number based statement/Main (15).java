import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int a=sc.nextInt();
	    if(a%3==2 && a%5==0 && a%8!=0 ){
	       System.out.println(" divisible");
	    }
	   // else if(a%5==0){
	   //    System.out.println(" divisible");
	   // }
	    else{
		System.out.println("not divisible by 8");
	    }
	
}
}