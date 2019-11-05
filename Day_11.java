import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Day_11 {

	private static int calculateFactorial(int uptoValue) {
        BigInteger answer=BigInteger.ONE;
        boolean oddUptoValue=((uptoValue&1)==1);
        int tempUptoValue=uptoValue;
        if(oddUptoValue){
            tempUptoValue=uptoValue-1;
            }

        int nextSum = tempUptoValue;
        int nextMulti = tempUptoValue;
        while (nextSum >= 2){
            answer=answer.multiply(BigInteger.valueOf(nextMulti));
            nextSum -= 2;
            nextMulti += nextSum;
        //  long product=(tempUptoValue-i+1L)*i;

        }
        if(oddUptoValue){
            answer=answer.multiply(BigInteger.valueOf(uptoValue));
        }
        
       answer=answer.mod(BigInteger.valueOf(uptoValue+1));
       
       return answer.compareTo(BigInteger.valueOf(uptoValue));
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int count=0;
			
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				int result=calculateFactorial(x-1);
				
				if(result==0) {
					count++;
				}
			}
			
			System.out.println(count);
		}

	}

}
