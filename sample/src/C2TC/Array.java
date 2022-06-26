package C2TC;
public class Array {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int i;
		int key=10;
		boolean flag=false;
		for(i=0;i<5;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
				break;
		}
			else
			{
				flag=false;
			}
	}
		if(flag==true)
		{
			System.out.println("Position of "+ key + " is:"+(i+1));
		}
		else
		{
		System.out.println("Element not found");
		}

}
}
