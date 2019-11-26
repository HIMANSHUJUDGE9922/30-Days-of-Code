import java.math.BigInteger;
import java.util.Scanner;

public class Day_17 {

	//TechProLabz Codes
	
	public static void Question_1(){
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t--!=0){
	            String str=sc.next();
	            BigInteger a=new BigInteger(str);
	            str=sc.next();
	            BigInteger b=new BigInteger(str);
	            System.out.println(gcd(a,b));
	        }
	}
	 
	public static BigInteger gcd(BigInteger a,BigInteger b){
	        
	        if(b.compareTo(BigInteger.valueOf(0))==0){
	            return a;
	        }
	        
	        return gcd(b,a.mod(b));
	    }
	    
	public static void Question_2() {
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t--!=0){
	            int n=sc.nextInt();
	            int q=1;
	            q=n&q;
	            int r=1;
	            System.out.println(q^r);
	            
	        }
	}

	public static void Question_3() {
	     Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
   while(t--!=0){
       
       int n=sc.nextInt();
       int q=1;
       q=n&q;
       int r=1;
       r=q^r;
       n=n|r;
       System.out.println(n);
       
       
       
   }
	}

	public static void Question_4() {
		 
		       Scanner sc=new Scanner(System.in);
		        int t=sc.nextInt();
		        while(t--!=0){   
		            long n=sc.nextLong();
		            long q=1;
		            q=n&q;
		            n=n^q;
		            System.out.println(n);
		    }
   }

	public static void main(String[] args) {
		
	}

}
