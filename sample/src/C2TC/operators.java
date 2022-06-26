package C2TC;
public class operators {
		public static void main(String[] args) {
		float a=4;
		//char c=98;
		int b=(int)4.0;
		System.out.println((a<6)&&(6!=b));  //4<6 && 6!=4
		System.out.println(b&6);  //4 & 6=0100 & 0110=0100=>4
		System.out.println(b|8);  //4|8=0100|1000=1100=>12
		System.out.println(~b);  //-(b+1)
		System.out.println(b++);  //4
		System.out.println(++b);  //6
		System.out.println(--b);  //5
		System.out.println(b--);  //5
		System.out.println(+b);  //4
		System.out.println(-b);  //-4

	}

}
