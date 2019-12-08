import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day_19 {

	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int arr[]=new int[9];
			int n=sc.nextInt();
			for(int i=1;i<=8;i++) {
				arr[i]=0;
			}
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(x>=1&&x<=8) {
					if(y>arr[x]) {
						arr[x]=y;
					}
				}
			}
			int sum=0;
			for(int i=1;i<=8;i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
		}
	}
	
	public static void Question_2() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int num_two=0,num_zero=0;
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				if(x==0)
					num_zero++;
				if(x==2)
					num_two++;
			}
			int result=0;
			if(num_zero>1){
				num_zero--;
				result=((num_zero)*(num_zero+1))/2;
			}
			if(num_two>1){
				num_two--;
				result+=((num_two)*(num_two+1))/2;
			}
			System.out.println(result);
			
			
		}

	}
	
	public static void Question_3() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			String str=sc.next();
			printSubsequences(str);
		}
	}
	
	public static void printSubsequences(String input){
		
		HashMap<String,Boolean> map=new HashMap<String, Boolean>();
		ArrayList<String> list=new  ArrayList<String>();
		printSubsequences(input,"",0,map,list);
		
		 int max=0;
		   for(int i=0;i<list.size();i++){
		       if((list.get(i)).length()>max){
		           max=(list.get(i)).length();
		           System.out.println(list.get(i));
		       }
		   }
		   System.out.println(max);
		   
	}
	public static void printSubsequences(String input,String str,int start,HashMap<String,Boolean> map,ArrayList<String> list) {
		if(start>=input.length()) {
			if(map.containsKey(str)) {
				list.add(str);
			}
			
			if((!map.containsKey(str))&&(str.length()!=0)) {
				map.put(str,true);
			}
			
			return;
		}
		
		//Case 1:start include
		printSubsequences(input,str+input.charAt(start),start+1,map,list);
		
		//Case 2 :Not Included
        printSubsequences(input,str,start+1,map,list);
		 
	}
	
	public static void Question_4() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			String str1=sc.next();
			String str2=sc.next();
			BigInteger a=new BigInteger(str1,2);
			BigInteger b=new BigInteger(str2,2);
			//long a=Long.parseLong(str1,2);
			//long b=Long.parseLong(str2,2);
			int cmp=b.compareTo(BigInteger.valueOf(0));
			int count=0;
			while(cmp>0) {
				BigInteger u=a.xor(b);
				//long u=a^b;
				BigInteger v=a.and(b);
				a=u;
				b=v.multiply(BigInteger.valueOf(2));
				count++;
				cmp=b.compareTo(BigInteger.valueOf(0));
			}
			System.out.println(count);
		}
	}
	
	public static void main(String[] args) {
	
		String str="aaabcadaa";
		printSubsequences(str);
		
		

	}

}
