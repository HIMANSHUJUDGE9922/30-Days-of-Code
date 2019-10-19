import java.util.ArrayList;
import java.util.Scanner;

public class Kick_Start {

	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int q=sc.nextInt();
			int result=0;
			
			int tear[]=new int[m];
			
			for(int j=0;j<m;j++) {
				tear[j]=sc.nextInt();
			}
			
			int lazy[]=new int[q];
			
			for(int j=0;j<q;j++) {
				lazy[j]=sc.nextInt();
				
				result+=(n/lazy[j]);
				for(int k=0;k<m;k++) {
					if(tear[k]%lazy[j]==0) {
						result=result-1;
					}
				}
			}
			System.out.println("Case #"+i+": "+result);
	
		}
	}

	//Question_2(KickStart)
	public static int subset(int arr1[],int arr2[],int sum){
		ArrayList<Integer> list=new ArrayList<Integer>();
		return subset(arr1,arr2,sum,0,0,list);
		
	}
	public static int subset(int arr1[],int arr2[],int sum,int start,int new_sum,ArrayList<Integer> list) {
		int count=0;
		if(start==arr1.length) {
			if(new_sum>=sum) {
				int req_sum=0;
				int k=0;
				ArrayList<Integer> array=new ArrayList<Integer>();
				for(int i=0;i<arr2.length;i++) {
					if(i==list.get(k)){
						array.add(arr2[i]);
						k++;
					}
					else {
						req_sum+=arr2[i];
						
						
					}
				}
			  ArrayList<Integer> array2=new ArrayList<Integer>();
			  ArrayList<Integer> array3=new ArrayList<Integer>();
			  
			 findsubsets(array,array3,sum-req_sum,0,0,array2);
			 count=count+array2.size();
			}
	   return count;
		}
	
		//Case 1 start included
				ArrayList<Integer> new_list=new ArrayList<Integer>();
				for(int i=0;i<list.size();i++) {
					new_list.add(list.get(i));
				}
			    new_list.add(start);
			            count+=subset(arr1,arr2,sum,start+1,new_sum+arr1[start],new_list);
				
				
		
		
		//Case 2 start not included
				count+=subset(arr1,arr2,sum,start+1,new_sum,list);	
		return count;
	
	}
	public static void findsubsets(ArrayList<Integer> array,ArrayList<Integer> array3,int sum,int new_sum,int start,ArrayList<Integer> array2) {
		if(start==array.size()) {
			if(new_sum>=sum){
				array2.add(1);
			}
		return;	
		}
		
		//Case 1
		 ArrayList<Integer> array4=new ArrayList<Integer>();
 		 for(int i=0;i<array3.size();i++) {
 			 array4.add(array3.get(i));
 		 }
 		 array4.add(array.get(start));
 		 findsubsets(array,array4,sum,new_sum+array.get(start),start+1,array2);
		
		//Case 2
		  findsubsets(array,array3,sum,new_sum,start+1,array2);
   }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=1;k<=t;k++){
			int n=sc.nextInt();
			int h=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				arr2[i]=sc.nextInt();
			}
			
		System.out.println(subset(arr1,arr2,h));
	}
		 

	}

}
