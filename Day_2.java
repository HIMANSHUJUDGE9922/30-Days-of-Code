import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0) {
        	int a,b,c;
        	a=sc.nextInt();
        	b=sc.nextInt();
        	c=sc.nextInt();
        	int sum=a*1+b*2+c*3;
        	if(sum%2!=0) {
        		System.out.println("NO");
        		continue;
        	}
        	if(a==0&&b==1&&c%2==0) {
        		System.out.println("NO");
        	}
        	if(b==0&&a==1&&c%2!=0) {
        		System.out.println("NO");
        	}
        	if(a==0&&c==0&&b%2!=0) {
        		System.out.println("NO");
        	}
        	else {
        		System.out.println("YES");
        	}
        	
        }

	}

}
