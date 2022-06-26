package C2TC;
import java.util.Scanner;
public class ex4_leap {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter any Year:");
	    int year = scan.nextInt();
	    if((year%4==0)&&(year%100!=0)||year%400==0)
	    	System.out.println("Leap Year");
	    else
	    	System.out.println("Not Leap Year");
	    }
	}
//year%4==0, year%100=0, year%400=0=>leap else not leap
//2020%4=0, 2020%100=0, 2020%400=0 =>leap
//2022%4!=0 =>not leap