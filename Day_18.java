import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day_18 {

	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		    if(!map.containsKey(arr[i])) {
		    	map.put(arr[i],1);
		    }
		}
		
		int count=0;
		for(int i=0;i<n;i++) {
			int x=arr[i];
			if((map.containsKey(x-1))||map.containsKey(x+1)) {
				continue;
			}
			else {
				int pos_1=x-1;
				int pos_2=x+1;
				
				map.put(x+1,1);
				count++;
				
				
				
				
			}
			
		}
      System.out.println(count);
		}
	}

	public static void Question_2() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<n;){
				int s_e=arr[i];
				if(i+1<=n-1){
					count=count+1;
					int diff=arr[i+1]-arr[i];
					int flag=0;
					ArrayList<Integer> list=new ArrayList<Integer>();
					while(flag==0){
						if(i+1>=n) {
							i++;
							break;
						}
						int new_diff=arr[i+1]-arr[i];
						if(new_diff==diff) {
							list.add(arr[i+1]);
						}
						else {
							i++;
							break;
						}
					 i++;	
					}
					
				
					if(list.size()==1){
						if(i>=n-1){
							System.out.print(s_e+","+list.get(0));
						}
						else {
							System.out.print(s_e+","+list.get(0)+",");
						}
						
					}
					else {
						if(diff==1) {
							if(i>=n-1) {
								System.out.print(s_e+"..."+list.get(list.size()-1));
							}
							else {
								System.out.print(s_e+"..."+list.get(list.size()-1)+",");
							}
						}
						else {
							if(i>=n-1) {
								System.out.print(s_e+"..."+list.get(list.size()-1));
							}
							else {
								System.out.print(s_e+"..."+list.get(list.size()-1)+",");
							}
						}
						
						
						
					}
				}
				else {
					if(count==0) {
					  System.out.print(s_e+" ");
					}
					else {
					     System.out.println(","+s_e);
					}
					i++;
				}
				
			}
			System.out.println();
			
			
		}
	}

	public static void main(String[] args) {




	
	
	
	}
}	

