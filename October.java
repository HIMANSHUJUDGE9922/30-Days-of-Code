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
			 long n=sc.nextLong();
			 long m=sc.nextLong();
			 long arr1[][]=new long[(int) (n+1)][(int) (m+1)];
			 long arr2[][]=new long[(int) (n+1)][(int) (m+1)];
			 long q=sc.nextInt();

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
			 
			 long count=0;
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=m;j++) {
					 arr1[i][j]=arr1[i][j]+arr2[i][j];
					 if(arr1[i][j]%2!=0) {
						 count++;
					 }
				 }
			 }
			System.out.println(count); 
		 }
	}
	
	public static void main(String[] args) {
		
   }
}
