import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day_23 {

	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int s=sc.nextInt();
			ArrayList<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<3;i++) {
				int x=sc.nextInt();
				list.add(x);
			}
			Collections.sort(list);
			int weight=0,count=0;
			for(int i=2;i>=0;i--) {
				weight=weight+list.get(i);
				if(weight>s){
					count++;
					weight=list.get(i);
				}
			}
			count++;
			System.out.println(count);
		}
	}

	public static void Question_2() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
// 			int c=(int)Math.pow(10,n-1);
            
            int s=(int) Math.pow(10,n);			
			s=s-1;
			
			for(int i=1;i<=s;i++){
			    int a=sc.nextInt();    
			    System.out.println(s);
			    System.out.flush();
			    int b=sc.nextInt();
			    System.out.println(i);
			    System.out.flush();
			    int d=sc.nextInt();
			    int e=s-(a+b+i+d);
			    if(e<=0){
			        e=1;
			    }
			    System.out.println(e);
			    int ans=sc.nextInt();
			    if(ans==-1){
			        break;
			    }
			    s--;
			}
		}

	}
	
	public static void Question_3() {
		  Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      
	      int arr[][]=new int[n+1][m+1];
	      
	      for(int i=1;i<=n;i++) {
	    	  for(int j=1;j<=m;j++) {
	    		  arr[i][j]=sc.nextInt();
	    	  }
	      }
	    	
	      int count=2*(n+m)-4;
	      for(int i=2;i<=n-1;i++) {
	    	  for(int j=2;j<=m-1;j++) {
	    		  
	    		  int center_ele=arr[i][j];
	    		  System.out.println(i+" "+j+" :  "+arr[i][j]);
	    		  int row_left=j-1;
	    		  int row_right=j+1;
	    		  int col_up=i-1;
	    		  int col_down=i+1;
	    		  
	    		  int flag=0;
	    		  while(flag==0) {
	    			 
	    			  if(row_left<=0||row_right>m||col_up<=0||col_down>n){
	    				  break;
	    			  }
	    			  
	    			  
	    			  if((arr[i][row_left]==arr[i][row_right])&&(arr[col_up][j]==arr[col_down][j])) {
	    				  count++;
	    			  }
	    			  else {
	    				  break;
	    			  }
	    			  row_left--;
	    			  row_right++;
	    			  col_up--;
	    			  col_down++;
	    		}
	    		  
	    		  
	    		  
	    		  
	    	  }
	      }
	    	
	    	
	    	System.out.println(count);
	    	
	    	
	}
	
	public static void main(String[] args) {
		
	    
	    	
	   
		
		
		
		
	}

}
