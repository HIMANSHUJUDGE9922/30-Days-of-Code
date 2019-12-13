import java.util.Scanner;

public class September2 {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int q=sc.nextInt();
			int r_a=-1,r_b=-1;
			for(int i=0;i<q;i++) {
				int x=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
			    if(x==1) {
			    	r_a=a;
			    	r_b=b;
			    	System.out.println("YES");
			    }
			    else {
			    	if(r_a>r_b) {
			    		if(a>r_a&&b>r_a) {
			    			if(a==b) {
			    				r_a=a;
			    				r_b=b;
			    				System.out.println("YES");
			    			}
			    			else {
			    			System.out.println("NO");
			    			}
			    		}
			    		else if(a==r_a&&b==r_b) {
			    			System.out.println("YES");
			    		}
			    		else if(a>r_a&&b==r_b) {
			    			r_a=a;
			    			System.out.println("YES");
			    		}
			    		else {
			    			r_b=b;
			    			System.out.println("YES");
			    		}
			    			
			    	}
			    	else if(r_a<r_b) {
			    		if(a>r_b&&b>r_b) {
			    			if(a==b) {
			    				r_a=a;
			    				r_b=b;
			    				System.out.println("YES");
			    			}
			    			else {
			    			System.out.println("NO");
			    			}
			    		}
			    		else if(a==r_a&&b==r_b) {
			    			System.out.println("YES");
			    		}
			    		else if(a==r_a&&b>r_b) {
			    			r_b=b;
			    			System.out.println("YES");
			    		}
			    		else {
			    			r_a=a;
			    			System.out.println("YES");
			    		}
			    	}
			    	else {
			    		if(a==r_a&&b==r_b) {
			    			System.out.println("YES");
			    		}
			    		else if(a>r_a&&b>r_b) {
			    			if(a==b){
			    				r_a=a;
			    				r_b=b;
			    				System.out.println("YES");
			    			}
			    			else {
			    				System.out.println("NO");
			    			}
			    		}
			    		else {
			    			System.out.println("NO");
			    		}
			    	}
			    }
				
				
				
			}
		}
}
}
