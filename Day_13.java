import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;



public class Day_13{

	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			long n=sc.nextLong();
			long k=n/2;
			if(k%2==0) {
				System.out.println((k/2)-1);
			}
			else {
				System.out.println(k/2);
			}
		}

	}
	
	public static int Question_2(int n,int m){
		int result=0;
		
		while(n!=m){
		          int option1=n*2;
	           	  int option2=n-1;
	              option1=Math.abs(option1-m);
	              option2=Math.abs(option2-m);
	              int check=Math.min(option1,option2);
	              if(check==option1) {
	            	  n=n*2;
	              }
	              else {
	            	  n=n-1;
	              }
	        result=result+1;      
	    }
		return result;
	}
	
	public static int minsteps(int n, int m) 
	{ 
	    int result = 0; 
	      
	   
	    while(m > n) 
	    { 
	    
	        if(m % 2 != 0)  
	        {    m++; 
	            result++; 
	        } 
	          m /= 2; 
	        result++; 
	    } 
	      
	    
	    return result + n - m; 
	} 
	
	public static void main(String[] args) {
		
    
	Question_1();
	
	}

}
//Scanner sc=new Scanner(System.in);
//
//int n=sc.nextInt();
;//int quota=sc.nextInt();
//PriorityQueue<vishu> heap=new PriorityQueue<vishu>(Collections.reverseOrder());
//for(int i=1;i<=n;i++) {
//   int x=sc.nextInt();
//   vishu p=new vishu(x,i);
//   heap.add(p);
//}
//for(int i=1;i<=quota;i++) {
//	vishu p=heap.poll();
//	System.out.print(p.b+" ");
//	if((p.a-1)>0) {
//		vishu new_pair=new vishu(((p.a)-1),p.b);
//		heap.add(new_pair);
//	}
//}
