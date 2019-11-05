import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day_14 {

	//Question 1 (November Challenge)
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int arr[]=new int[10];
			for(int i=0;i<n;i++) {
				String str=sc.next();
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)=='1'){
						arr[j]+=1;
					}
				}
			}
		int count=0;	
		for(int i=0;i<10;i++) {
			if(arr[i]%2!=0) {
				count=count+1;
			}
		}
	System.out.println(count);	
	}
	}
	
	//Question 2(November Challenge)
	public static void Question_2() {
		  Scanner sc=new Scanner(System.in);
	         int t=sc.nextInt();
	         while(t--!=0) {
	        	 int n=sc.nextInt();
	        	 ArrayList<Integer> list=new ArrayList<Integer>();
	        	 HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
	        	 list.add(0);
	        	 for(int i=0;i<n-1;i++) {
	        		 int y=list.get(list.size()-1);
	        		 if(map.containsKey(y)) {
	        			 int index=map.get(y);
	        			 list.add(i-index);
	        			 map.put(y,i);
	        		 }
	        		 else {
	        			 map.put(y,list.size()-1);
	        			 list.add(0);
	        			 
	        		 }
	        	 }
	        	 
	         int x=list.get(n-1);	 
	         int count=0;
	         for(int i=0;i<n;i++) {
	        	 if(list.get(i)==x) {
	        		 count=count+1;
	        	 }
	         }
	         System.out.println(count);
	         }

	}
	
	public static void main(String[] args) {
       
	}

}
