import java.util.Scanner;

public class Day_4 {

	//Code for Length of Common Pattern 
	public static void lenghtCommonPattern(Scanner sc){
		int t=sc.nextInt();
		while(t--!=0) {
			String str1,str2;
			str1=sc.next();
			str2=sc.next();
			int small[]=new int[26];
			int capital[]=new int[26];
			int digits[]=new int[10];
			for(int i=0;i<str2.length();i++) {
				if(str2.charAt(i)>='a'&&str2.charAt(i)<='z') {
					int k=str2.charAt(i)-'a';
					small[k]=small[k]+1;
				}
				if(str2.charAt(i)>='A'&&str2.charAt(i)<='Z') {
					int k=str2.charAt(i)-'A';
					capital[k]++;
				}
				if(str2.charAt(i)>='0'&&str2.charAt(i)<='9') {
					int k=str2.charAt(i)-'0';
					digits[k]=digits[k]+1;
				}
			}
			int count=0;
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)>='a'&&str1.charAt(i)<='z') {
					int k=str1.charAt(i)-'a';
					if(small[k]>0) {
						count=count+1;
						small[k]=small[k]-1;
			    	}
			    }
			
				else if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z') {
					int k=str1.charAt(i)-'A';
					if(capital[k]>0) {
						count=count+1;
						capital[k]=capital[k]-1;
			    	}
				}
				
				else {
					int k=str1.charAt(i)-'0';
					if(digits[k]>0) {
						count=count+1;
						digits[k]=digits[k]-1;
					}
				
				}
			
			}
			System.out.println(count);
		}

	}
	
	public static void lengthColumn(Scanner sc) {
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				sum=sum+x;
			}
			float x=(float)(sum+m)/n;
			int y=(sum+m)/n;
			
			if(x==y) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
	}

}
