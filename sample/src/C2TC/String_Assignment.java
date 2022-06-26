package C2TC;

public class String_Assignment {

	public static void main(String[] args) {
		String A="yuvasri";
		String B="vaishnavi";
		int len1=A.length();
		int len2=B.length();
		int sum=len1+len2;
		System.out.println("Sum of lengths of "+A+" and "+B+" is:"+sum);
		
		
		int res=A.compareTo(B);
		if(res<0)
			System.out.println(A+" is lexicographically greater than "+B);
		else if(res==0)
			System.out.println(A+" is lexicographically equal to "+B);
		else
			System.out.println(A+" is lexicographically lesser than "+B);
		
		
		
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1));
		

	}

}
