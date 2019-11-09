import java.util.HashMap;
import java.util.Scanner;

public class Day_15 {

	public static void Question_1(int arr1[],int arr2[],int n,Scanner sc){
		int t=sc.nextInt();
		while(t--!=0){
			HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> map2=new HashMap<Integer, Integer>();
			int l1=sc.nextInt();
			int h1=sc.nextInt();
			int l2=sc.nextInt();
			int h2=sc.nextInt();
			l1=l1-1;
			h1=h1-1;
			l2=l2-1;
			h2=h2-1;
			for(int j=l1;j<=h1;j++) {
				if(!map1.containsKey(arr1[j])) {
					map1.put(arr1[j],1);
				}
			}
			for(int j=l2;j<=h2;j++) {
				if(!map1.containsKey(arr2[j])) {
					map1.put(arr2[j],1);
				}
			}
			int count=0;
			for(int j=0;j<l1;j++){
				if(!map1.containsKey(arr1[j])){
					if(!map2.containsKey(arr1[j])) {
						map2.put(arr1[j],1);
//						System.out.print(arr1[j]+" ");
						count=count+1;
					}
				}
			}
			for(int j=0;j<l2;j++){
				if(!map1.containsKey(arr2[j])){
					if(!map2.containsKey(arr2[j])) {
						map2.put(arr2[j],1);
//						System.out.print(arr2[j]+" ");
						count=count+1;
					}
				}
			}
			for(int j=h1+1;j<n;j++){
				if(!map1.containsKey(arr1[j])){
					if(!map2.containsKey(arr1[j])) {
						map2.put(arr1[j],1);
//						System.out.println(arr1[j]+" ");
						count=count+1;
					}
				}
			}
			for(int j=h2+1;j<n;j++){
				if(!map1.containsKey(arr2[j])){
					if(!map2.containsKey(arr2[j])) {
						map2.put(arr2[j],1);
//						System.out.println(arr2[j]+" ");
						count=count+1;
					}
				}
			}
		System.out.println(count);
		}
		
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr1[]=new int[n];
	int arr2[]=new int[n];
	
	   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	  
	   for(int i=0;i<n;i++){
		 arr1[i]=sc.nextInt();
		 if(!map.containsKey(arr1[i])) {
			 map.put(arr1[i],1);
		 }
	   }
	   
	   for(int i=0;i<n;i++) {
		 arr2[i]=sc.nextInt();
		 if(!map.containsKey(arr2[i])) {
			 map.put(arr2[i],1);
		 }
       }
		
		int t=sc.nextInt();
		while(t--!=0){
			int count=map.size();
//			System.out.println("Size of map "+map.size());
			HashMap<Integer,Integer> map2=new HashMap<Integer, Integer>();
			int l1=sc.nextInt();
			int h1=sc.nextInt();
			int l2=sc.nextInt();
			int h2=sc.nextInt();
			
			l1--;
			h1--;
			l2--;
			h2--;
			
			for(int j=l1;j<=h1;j++) {
				if(map.containsKey(arr1[j])) {
					if(!map2.containsKey(arr1[j])){
//						System.out.print(arr1[j]+" ");
						map2.put(arr1[j],1);
						count--;
					}
				}
			}
			
			for(int j=l2;j<=h2;j++) {
				if(map.containsKey(arr2[j])) {
					if(!map2.containsKey(arr2[j])) {
						map2.put(arr2[j],1);
//						System.out.print(arr2[j]+" ");
						count--;
					}
				}
			}
		System.out.println(count);
		}
		
	}

}
