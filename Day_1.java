import java.util.Scanner;
public class Day_1 {
	public static int arr[]= {6,2,5,5,4,5,6,3,7,6};
		public static int matches(int c) {
			int ans=0;
			while(c!=0) {
				ans=ans+arr[c%10];
			c=c/10;
			}
			
			return ans;
		}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE);
		int t=sc.nextInt();
		while(t--!=0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			System.out.println(matches(c));
		}
		
		
		
		}

}


