import java.util.Scanner;

public class Kick_Start {

	public static void main(String[] args) {
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

}
