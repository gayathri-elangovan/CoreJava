package C2TC;

import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double data;
		int count=0;
		int n=s.nextInt();
		for(int i=0;i<=n;i++) {
			
			try {
				data=100.0/i;
				System.out.println(data+"");
			}
		catch(ArithmeticException e)
		{count++;
			System.out.println(e);
		}
		finally
		{if(i==n)
		{
			if(count==0)
				System.out.println("NO exception");
			else
				System.out.println(count+" exception handeled");
		}
			//System.out.println(i+"");

	}
	}
	//1.try will execute only till it finds exception and 
	//if no exception runs statements completely
	//2.finally-no matter whether exception is occured or not ,
	//execute finally block without fail
	//3.catch is executed only if exception occurs
		//if data=100.0 ,then it gives infinity(float/int)
}
}