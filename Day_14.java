import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day_14 {

	//Question 1 (November Challenge)
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=1;k<=t;k++){
			int n=sc.nextInt();
			int array[]=new int[10];
			for(int i=0;i<n;i++) {
				String str=sc.next();
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)=='1'){
						array[j]+=1;
					}
				}
			}
		int result=0;	
		for(int i=0;i<10;i++) {
			if(array[i]%2!=0) {
				result=result+1;
			}
		}
	System.out.println(result);	
	}
	}
	
	//Question 2(November Challenge)
	public static void Question_2() {
		  Scanner sc=new Scanner(System.in);
	         int t=sc.nextInt();
	         for(int l=1;l<=t;l++){
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
		//Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		//while(t--!=0) {
//			   int x=sc.nextInt();
//			   int y=sc.nextInt();
//			   int n=sc.nextInt();
//			   int m=sc.nextInt();
//			   int k=sc.nextInt();
//			   ArrayList<Pair> list1=new ArrayList<Pair>();
//			   ArrayList<Pair> list2=new ArrayList<Pair>();
//			   ArrayList<Pair> list3=new ArrayList<Pair>();
//			   
//			   int pos_1=-1,pos_2=-1,pos_3=-1;
//			   
//			   double arr1[]=new double[n];
//			   double arr2[]=new double[m];
//			   double arr3[]=new double[k];
//			   
//			   for(int i=0;i<n;i++) {
//				   int a=sc.nextInt();
//				   int b=sc.nextInt();
//				   Pair p=new Pair(a,b);
//				   list1.add(p);
//			   }
//			   
//			   for(int i=0;i<m;i++) {
//				   int a=sc.nextInt();
//				   int b=sc.nextInt();
//				   Pair p=new Pair(a,b);
//				   list2.add(p);
//			   }
//			   
//			   double min=Integer.MAX_VALUE;
//			   for(int i=0;i<k;i++){
//				   int a=sc.nextInt();
//				   int b=sc.nextInt();
//				   Pair p=new Pair(a,b);
//				   list3.add(p);
//			        double di=(x-a)*(x-a)+(y-b)*(y-b);
//			        di=Math.sqrt(di);
//			        if(di<min) {
//			        	min=di;
//			        	pos_3=i;
//			        }
//			   }
//			   
//			   min=Integer.MAX_VALUE;
//			   for(int i=0;i<m;i++){
//				  Pair p=list3.get(pos_3);
//				  Pair p1=list2.get(i);
//			      double di=(p.a-p1.a)*(p.a-p1.a)+(p.b-p1.b)*(p.b-p1.b);
//				  di=Math.sqrt(di); 
//				  if(di<min) {
//					  min=di;
//					  pos_2=i;
//				  }
//			   }
//			   for(int i=0;i<m;i++){
//				  Pair p=list3.get(pos_3);
//				  Pair p1=list1.get(i);
//			      double di=(p.a-p1.a)*(p.a-p1.a)+(p.b-p1.b)*(p.b-p1.b);
//				  di=Math.sqrt(di); 
//				  if(di<min) {
//					  min=di;
//					  pos_1=i;
//					  pos_2=-1;
//				  }
//			   }
//			   System.out.println(pos_1+" "+pos_2+" "+pos_3);

		
	  }
	}
