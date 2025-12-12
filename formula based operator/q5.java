import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a1=sc.nextInt();
	    int a2=sc.nextInt();
	    int b1=sc.nextInt();
	    int b2=sc.nextInt();
	    Double x1=Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
	    //Double area=(a*a)*3.14;
		System.out.println(x1);
	}
}
