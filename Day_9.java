import java.util.HashMap;
import java.util.Scanner;

public class Day_9 {
	 public static int gcd(int a, int b) 
	    { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    } 
    
	//Code chef Contest Question_1
	public static void Question_1() {
    	   Scanner sc=new Scanner(System.in);
   		int t=sc.nextInt();
   		while(t--!=0) {
   		
   			int n=sc.nextInt();
   	    	int k=sc.nextInt();
   		  
   	    	for(int i=1;i<=k;i++) {
   	    		if(n%10==9){
   	    			n=n-9;
   	    		}
   	    		else {
   	    			n=n+1;
   	    		}
   	    	}
   	    	System.out.println(n);
   		}
       }
	
	//Code chef Question_2(Getting Runtime Error for it)
	public static void Question_2() {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0) {
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    
	    int arr1[][]=new int[n+1][n+1];
	    int arr2[][]=new int[n+1][n+1];
	    
		while(k--!=0) {
			int sv=sc.nextInt();
			int ev=sc.nextInt();
			arr1[sv][1]=1;
			arr2[1][ev]=1;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr1[i][j]=arr1[i][j]+arr1[i][j-1];
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr2[i][j]=arr2[i][j]+arr2[i-1][j];
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			  arr1[i][j]+=arr2[i][j];	
			}
			
		}
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			   if(arr1[i][j]==0) {
				   count=count+1;
			   }
			}
	    }
		if(count==0) {
			System.out.println("Impossible");
		}
		else {
			System.out.println(count+" "+n*n);
		}
		
		
	}
	}
	
	//Code chef Question_2(Getting Correct Answer for it)
	public static void Question_2Final() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int count=n*n;
			int count_x=0,count_y=0;
			HashMap<Integer,Integer> map_x=new HashMap<Integer, Integer>();
			HashMap<Integer,Integer> map_y=new HashMap<Integer, Integer>();
			while(k--!=0) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(!map_x.containsKey(x)) {
					map_x.put(x,1);
					count_x=count_x+1;
				}
				if(!map_y.containsKey(y)) {
					map_y.put(y,1);
					count_y=count_y+1;
				}
			}
			count=count-((count_x)*n)-(n-count_x)*(count_y);
			if(count==0) {
				System.out.println("Impossible");
			}
			else {
			        int hcf=gcd(count,n*n);
			        count=count/hcf;
			        int result=n*n;
			        result=result/hcf;
			        System.out.println(count+" "+result);
			}
			
			
		}
	}
	
	
	public static void Question_1October() {
		 Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t--!=0) {
        	 int n=sc.nextInt();
        	 int first=sc.nextInt();
        	 int second=sc.nextInt();
        	 int min,max,min_pos,max_pos;
        	 if(first>second) {
        		 max=first;
        		 max_pos=0;
        		 min=second;
        		 min_pos=1;
        	 }
        	 else {
        		 max=second;
        		 max_pos=1;
        		 min=first;
        		 min_pos=0;
        	 }
        	 for(int i=2;i<n;i++) {
        		 int x=sc.nextInt();
        		 if(x<min) {
        			 min=x;
        			 min_pos=i;
        		 }
        		 if(x>max) {
        			 max=x;
        			 max_pos=i;
        		 }
        	 }
        	 if(min_pos<max_pos) {
        		 System.out.println(min+" "+max);
        	 }
        	 else {
        		 System.out.println(max+" "+min);
        	 }
        	 
         }
	}
	
	public static boolean  makeOne(long n,long start) {
		if(start==n){
			return true;
		}
		if(start>n) {
			return false;
		}
		boolean  option1=makeOne(n,start*10);
		if(option1==true) {
			return true;
		}
		boolean option2=makeOne(n,start*20);
		if(option2==true) {
			return true;
		}
		return false;
	}
	
 
	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			   long n=sc.nextLong();
			   boolean result=makeOne(n,1);
			   if(result==true) {
				   System.out.println("Yes");
			   }
			   else {
				   System.out.println("No");
			   }
		}
    	
    
    }
}
