package C2TC;
import java.util.Scanner;
public class ex3_odd_even
{
    public static void main(String args[])
    {
        int number;
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scanner.nextInt();
        if((number & 1)== 0)
        {
            System.out.println("The Given Number "+number+" is Even");
        }
        else
        {
            System.out.println("The Given Number "+number+" is Odd");
        }
    }
}
//if number=13.binary representation of 13=1101. 
//1101 & 1==1101 & 0001= 0001=>1=odd 
//if number=10. binary representation of 10=1010.
//1010 & 1==1010 & 0001= 0000=>0=even