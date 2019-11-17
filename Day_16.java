import java.util.Scanner;

public class Day_16 {

	//COOKOFF NOVEMBER
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int l=1;l<=t;l++){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int rem=0,flag=0,pos=-1;
		    for(int i=0;i<n;i++){
		        rem=rem+arr[i];
		        if(rem>=k){
		            rem=rem-k;
		        }
		        else{
		             flag=1;
		             pos=i+1;
		             break;
		        }
		    }
		    if(flag==0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO "+(pos));
		    }
		    
		}
		
	}
	
	//COOKOFF NOVEMBER
	public static void Question_2() {	
	     Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			int pos_x=-1,pos_y=-1,count=0,dr=-1,dc=-1;
			
			int arr[][]=new int[n][m];
			int brr[][]=new int[n][m];
			
			
			
			for(int i=0;i<n;i++){
				String str=sc.next();
				for(int j=0;j<m;j++){
					if(str.charAt(j)=='1') {
						arr[i][j]=1;
					}
					else {
						arr[i][j]=0;
					}
					
					if(arr[i][j]==1&&count==0){
						pos_x=i;
						pos_y=j;
						count=1;
					}
				}
			}
			
			count=0;
			
			for(int i=0;i<n;i++) {
				String str=sc.next();
				for(int j=0;j<m;j++) {
					if(str.charAt(j)=='1') {
						brr[i][j]=1;
					}
					else {
						brr[i][j]=0;
					}
					
					if(brr[i][j]==1&&count==0){
						count=1;
						if(pos_x>i) {
							dr=-(pos_x-i);
						}
						else {
						   dr=i-pos_x;	
						}
						
						if(pos_y>j) {
							dc=-(pos_y-j);
						}
						else {
							dc=j-pos_y;
						}
						
						
					}
				}
			}
			count=0;
			System.out.println(dr+" "+dc);
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j]==1){
						int new_x=i+dr;
						int new_y=j+dc;
					    if(new_x>=0&&new_x<n&&new_y>=0&&new_y<m){
					    	if(brr[new_x][new_y]!=1) {
//					    		System.out.println("Aaya"+" (i,j) "+i+" "+j);
					    		count=count+1;
					    	}
					    }
//					    else {
//					    	count=count+1;
//					    }
					}
					else if(brr[i][j]==1){
						int new_x=i-dr;
						int new_y=j-dr;
						if(new_x>=0&&new_x<n&&new_y>=0&&new_y<m){
					    	if(arr[new_x][new_y]!=1) {
//					    		System.out.println("Aaya"+" (i,j) "+i+" "+j);
					    		count=count+1;
					    	}
					    }
					    
						
					}
					
										
				}
			}
			
		System.out.println(count);
		}
		
	}
	
	public static void main(String[] args) {
		

	}

}
