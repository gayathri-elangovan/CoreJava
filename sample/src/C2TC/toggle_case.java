package C2TC;

import java.util.Scanner;

public class toggle_case {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		int str_len=sb.length();
		for(int i=0;i<str_len;i++)
		{
			char ch=sb.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char) ((char)ch-32);
			}
			else if(ch>='A' && ch<='Z')
			{
				ch=(char) ((char)ch+32);
			}
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);
		

	}

}
/* a=97 A=65
a->A  97-32
A->a 97+32
*/