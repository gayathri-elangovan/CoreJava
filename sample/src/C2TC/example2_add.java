package C2TC;

import java.util.Scanner;

public class example2_add{
	public static void main(String[] args) {
		int a,b,sum;
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		
		sum=sum(a,b);
		System.out.println("The sum of a and b is:"+sum);
		

}
	public static int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}