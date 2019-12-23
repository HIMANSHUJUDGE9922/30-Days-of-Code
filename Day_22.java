import java.math.BigInteger;
import java.math.*;
import java.util.Scanner;

public class Day_22 {

	
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			
			int count_num=(count(2*n));
			
			int count_den=(count(n));
			
			count_den=(count_den)*2;
			
			if(count_den>=count_num) {
				System.out.println("0");
			}
			else {
				System.out.println(count_num-count_den);
			}
			
			
		}

	}
	
	public static void Question_2() {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			BigInteger answer=factorial(n);
			int new_answer=answer.intValue();
//			int div=findDivisors(new_answer);
//			div=div/2;
			
			
//			System.out.println(modularExponentiation(new_answer,div , M));
		}
			
	}
	
	public static int count(int x){
		int count=0;
		
		 for (int i = 5; x / i >= 1; i *= 5) 
		        count += x / i; 
		  
		
		return count;
	}
	
	public static BigInteger sqrt(BigInteger n) {
	    BigInteger a = BigInteger.ONE;
	    BigInteger b = n.shiftRight(1).add(new BigInteger("2")); // (n >> 1) + 2 (ensure 0 doesn't show up)
	    while (b.compareTo(a) >= 0) {
	        BigInteger mid = a.add(b).shiftRight(1); // (a+b) >> 1
	        if (mid.multiply(mid).compareTo(n) > 0)
	            b = mid.subtract(BigInteger.ONE);
	        else
	            a = mid.add(BigInteger.ONE);
	    }
	    return a.subtract(BigInteger.ONE);
	}
	
	public  static int findDivisors(BigInteger n1) 
    { 
        n1=sqrt(n1);
        int n=n1.intValue();
        int count=0;
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                 
                if (n/i == i) 
                    count=count+1;
       
                else 
                    count=count+2; 
            } 
        } 
      return count;  
    } 
	
	public static BigInteger factorial(int number) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = number; i > 0; i--){ 
			factorial = factorial.multiply(BigInteger.valueOf(i)); 
		}
		return factorial;
	}

	public static int modularExponentiation(int x,int n,int M)
	{
	    if(n==0)
	        return 1;
	    else if(n%2 == 0)        //n is even
	        return modularExponentiation((x*x)%M,n/2,M);
	    else                             //n is odd
	        return (x*modularExponentiation((x*x)%M,(n-1)/2,M))%M;

	}
	
	public static int modInverse(int A,int M)
	{
	    return modularExponentiation(A,M-2,M);
	}
	
	public static void main(String[] args) {
		
	
	}

}
