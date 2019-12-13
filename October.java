import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class October {

	//This class contains all codes for the October Long Challenges
	
    //Question 1
	public static void s10E() {
		Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t--!=0){
	          int n=sc.nextInt();
	          int arr[]=new int[n];
	          
	          for(int i=0;i<n;i++){
	              arr[i]=sc.nextInt();
	          }
	          
	          int count=1;
	          int min=arr[0];
	          for(int i=1;i<=4;i++){
	              if(arr[i]<min){
	                  min=arr[i];
	                  count=count+1;
	              }
	          }
	          for(int i=5;i<n;i++){
	              min=Math.min(arr[i-5],Math.min(arr[i-4],Math.min(arr[i-3],Math.min(arr[i-2],arr[i-1]))));
	              if(arr[i]<min){
	                  count++;
	              }
	          }
	      
	          System.out.println(count);
	      }
	}

	//Question 2
	public static void saktan() {
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t--!=0) {
			 int n=sc.nextInt();
			 int m=sc.nextInt();
			 int arr1[][]=new int[n+1][m+1];
			 int arr2[][]=new int[n+1][m+1];
			 int q=sc.nextInt();

			 for(int i=0;i<q;i++){
				 int x=sc.nextInt();
				 int y=sc.nextInt();
				 arr1[x][1]=arr1[x][1]+1;
				 arr2[1][y]=arr2[1][y]+1;
			 }
			 for(int i=1;i<=n;i++){
				 for(int j=1;j<=m;j++) {
					 arr1[i][j]+=arr1[i][j-1];
				 }
			 }
			 
			 for(int i=1;i<=m;i++) {
				 for(int j=1;j<=n;j++) {
					 arr2[j][i]+=arr2[j-1][i];
				 }
			 }
			 
			 int count=0;
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=m;j++) {
					 BigInteger sum=BigInteger.valueOf(arr1[i][j]);
					 sum=sum.add(BigInteger.valueOf(arr2[i][j]));
					 sum=sum.mod(BigInteger.valueOf(2));
					 int res=sum.compareTo(BigInteger.valueOf(0));
					 if(res==0) {
						 count++;
					 }
				 }
			 }
			System.out.println(count); 
		 }

	}
	
	//Question 3
	public static void arrayModi() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
	          
			 int n=sc.nextInt();
			 int k=sc.nextInt();
			 ArrayList<Integer> list=new ArrayList<Integer>();
			 for(int i=0;i<n;i++) {
				 int x=sc.nextInt();
				 list.add(x);
			 }
			for(int i=0;i<k;i++) {
				int z=i%n;
				int a=list.get(z);
				int b=list.get(n-1-z);
				list.set(z,a^b);
			}
			for(int i=0;i<n;i++) {
				System.out.print(list.get(i)+" ");
			}
			
			
				
			}
	}
    
	
	public static void main(String[] args) {
		
	 }
}
