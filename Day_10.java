import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day_10 {

	public static int fact(int x){
		if(x==1) {
			return 1;
		}
		return x*fact(x-1);
	}
	
	//Question 1(HackerEarth October Circuit)
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int ways=fact(n);
			int result=ways*(2*n*n-(n*(n+1)));
			result=result/2;
			System.out.println(result);
		}

	}
    
	//Question 2(HackerEarth October Circuit)
    public static long xor(long a,long b,long n){
		long result=a^b;
		if(n==1) {
			return a;
		}
		if(n==2) {
			return b;
		}
		for(int i=3;i<=n;i++) {
			result=a^b;
			a=b;
			b=result;
		}
		return result;
	}
	public static void Question_2() {
		 Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t--!=0) {
	    	  long a=sc.nextLong();
	    	  long b=sc.nextLong();
	    	  long n=sc.nextLong();
	    	  long x_or=xor(a,b,n);
	    	 
	    	  
	    	  String str1=Long.toBinaryString(x_or);
	    	  long len=str1.length();
	    	  if(len<3) {
	    		  for(int i=1;i<=(3-len);i++) {
	    			  str1='0'+str1;
	    		  }
	    	  }
	    	  if(str1.charAt(0)=='0') {
	    		  System.out.println(x_or);
	    		  continue;
	    	  }
	    	  
	    	  String str2="";
	    	  for(int i=0;i<str1.length();i++) {
	    		if(str1.charAt(i)=='1') {
	    			str2+='0';
	    		}
	    		else {
	    			str2+='1';
	    		}
	    	  }
	    	
	    	  long x_nor=Long.parseLong(str2,2);
	    	  if(x_or>x_nor) {
	    		  System.out.println(x_or);
	    	  }
	    	  else {
	    		  System.out.println(x_nor);
	    	  }
	    	  
	      }

	}
	 
	public static void Question_3() {
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int q=sc.nextInt();
	    
	     int arr[]=new int[n+1];
	     
	     for(int i=1;i<=n;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     
		while(q--!=0){
			int max=0;
			HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
		    int l=sc.nextInt();
		    int r=sc.nextInt();
		    int d=sc.nextInt();
		    boolean visited[]=new boolean[n+1];
		    for(int i=l;i<=r;i++) {
		    	if(map.containsKey(arr[i])) {
		    		ArrayList<Integer> x=map.get(arr[i]);
		    		x.add(i);
		    		map.put(arr[i],x);
		    	}
		    	else {
		    		ArrayList<Integer> x=new ArrayList<Integer>();
		    		x.add(i);
		    		map.put(arr[i],x);
		    	}
		    }
		    
		    for(int i=l;i<=r;i++) {
		    	if(!visited[i]) {
		    		visited[i]=true;
		    		int flag=0,count=0;
		    		int k=0;
		    		while(flag==0) {
		    			if(map.containsKey(arr[i]+k*d)) {
		    				count=count+1;
		    				visited[arr[i]+k*d]=true;
		    				k++;
		    			}
		    			else {
		    				break;
		    			}
		    		}
		    		if(count>max) {
		    			max=count;
		    		}
		    	}
		    }
		    System.out.println(max);
		    
		 }
	
	}
    public static void Question_3Second() {
    	 Scanner sc=new Scanner(System.in);
         
         int n=sc.nextInt();
         int q=sc.nextInt();
        
         int arr[]=new int[n+1];
         
         for(int i=1;i<=n;i++) {
         	arr[i]=sc.nextInt();
         }
 		while(q--!=0) {
 			int l=sc.nextInt();
 			int r=sc.nextInt();
 			int diff=sc.nextInt();
 			
 			HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
 			
 			for(int i=l;i<=r;i++) {
 			    if(!map.containsKey(arr[i])){
 					map.put(arr[i],arr[i]);
 				}
 				
 			}
 			
 			for(int i=l;i<=r;i++) {
 				if(map.containsKey(arr[i]-diff)){
 					map.put(arr[i],(arr[i]-diff));
 				}
 			}
 			int max=1;
 			HashMap<Integer,Integer> map_2=new HashMap<Integer, Integer>();
 			for(int i=l;i<=r;i++) {
 				if((map.get(arr[i]))==arr[i]){
 					map_2.put(arr[i],1);
 				
 				}
 				else {
 					int parent=getparent(arr[i],map);
 					if(map_2.containsKey(parent)) {
 						int val=map_2.get(parent);
 						val=val+1;
 						map_2.put(parent,val);
 						if(val>max) {
 							max=val;
 						}
 					}
 					else {
 						map_2.put(parent,1);
 						
 					}
 				}
 			}
 			
 		System.out.println(max);
 		}
 		
    }
	

    public static int getparent(int x,HashMap<Integer,Integer> map){
		if(map.get(x)==x) {
			return x;
		}
		return getparent(map.get(x),map);
	}
	
    //Question 1 Codechef Contest
    public static void Question_1Codechef() {
    	 Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t--!=0) {
      	   String str=sc.next();
      	   HashMap<Character,Integer> map=new HashMap<Character, Integer>();
      	   for(int i=0;i<str.length();i++) {
      		   if(!map.containsKey(str.charAt(i))) {
      			   map.put(str.charAt(i), 1);
      			   System.out.print(str.charAt(i));
      		   }
      	   }
      	   System.out.println();
         }
    }
   
    //Question 2 Codechef Contest
    public static long modularExponentiation(long x,long n,long M)
    {
        if(n==0)
            return 1;
        else if(n%2 == 0)        //n is even
            return modularExponentiation((x*x)%M,n/2,M);
        else                             //n is odd
            return (x*modularExponentiation((x*x)%M,(n-1)/2,M))%M;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t--!=0) {
        	long n=sc.nextLong();
        	if(n==0){
        	    System.out.println("0 0");
        	    continue;
        	}
        	long M=1000000007;
        	long result=modularExponentiation(2,n-1,M);
        	System.out.println((result-1)+" "+(result));
        }
	
	
	
	}

}
