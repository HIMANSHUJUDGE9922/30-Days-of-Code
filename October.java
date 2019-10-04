import java.util.Scanner;

public class October {

	//This class contains all codes for the Octobe rLong Challenges
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
	
	public static void main(String[] args) {
	 
		
		
    }
}
