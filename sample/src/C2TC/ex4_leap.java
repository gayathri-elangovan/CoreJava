package C2TC;
import java.util.Scanner;
public class ex4_leap {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter any Year:");
	    int year = scan.nextInt();
	    boolean isLeap = false;
	    if (year % 4 == 0) 
	    {
	    	if (year % 100 == 0) 
	    	{
	    		if (year % 400 == 0) 
	    		{
	    			isLeap = true;
	    		} 
	    		else
	    		{
	    			isLeap = false;
	    		}
	    	}
	    	else 
	    	{
	    		isLeap = true;
	    	}
	    } 
	    else 
	    {
	      isLeap = false;
	    }

	    if (isLeap == true)
	    {
	      System.out.println(year + " is a Leap Year.");
	    } 
	    else 
	    {
	      System.out.println(year + " is not a Leap Year.");
	    }
	  }
	}
//year%4==0, year%100=0, year%400=0=>leap else not leap
//2020%4=0, 2020%100=0, 2020%400=0 =>leap
//2022%4!=0 =>not leap