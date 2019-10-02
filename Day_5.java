import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Day_5 {

	//******************Questions of Past Contests(KJSCE Code Spree)**********//
	
	//Code for Friends Number
	public static void friendsNumber(Scanner sc){
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int result=0;
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				result=result^x;
			}
			if(n%2==0) {
				System.out.println("-1");
			}
			else {
				System.out.println(result);
			}
		}

	}
	
	//Code for Tshirts for all
	public static void tShirts() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int q=sc.nextInt();
			HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				if(map.containsKey(x)) {
					int y=map.get(x);
					y++;
					map.put(x,y);
				}
				else {
					map.put(x,1);
				}
			}
		ArrayList<Integer> list=new ArrayList<Integer>();	
		Set<Integer> set=map.keySet();	
		for(Integer x:set) {
			list.add(map.get(x));
		}
		Collections.sort(list);	
		
		for(int i=1;i<list.size();i++) {
			int z=list.get(i)+list.get(i-1);
			list.set(i,z);
		}
		for(int i=0;i<q;i++) {
			int m=sc.nextInt();
			int start_pos=list.size()-1;
			int end_pos=(list.size()-1)-m;
			if(end_pos>=0) {
				System.out.println(list.get(start_pos)-list.get(end_pos));
			}
			else {
				System.out.println(list.get(start_pos));
			}
		}
		
		}
	}

	//Code for Chocolate Distribution
	public static void choco(Scanner sc){
		int t=sc.nextInt();
		while(t--!=0) {
			int x=sc.nextInt();
			int n=sc.nextInt();
			float result_1=(float)((2*x)-(n*n)+n)/(2*n);
		    int result_2=((2*x)-(n*n)+n)/(2*n);
		   
		    if(result_1==result_2) {
		    	System.out.println("Y"+" "+result_2);
		    }
		    else {
		    	System.out.println("N");
		    }
		}

	}
	
	//*******************Question of August Long Challenge********************//
	
	//Code for Eidi Gift
	public static void eidiGift(Scanner sc) {
		int t=sc.nextInt();
		while(t--!=0) {
			int age[]=new int[3];
			int money[]=new int[3];
			for(int i=0;i<3;i++) {
				age[i]=sc.nextInt();
			}
			for(int i=0;i<3;i++) {
				money[i]=sc.nextInt();
			}
		 
			int flag=0;
			for(int i=0;i<2;i++) {
				for(int j=i+1;j<3;j++) {
					if(age[i]<age[j]) {
						if(money[i]>=money[j]) {
							flag=1;
							break;
						}
					}
					else if(age[i]>age[j]) {
						if(money[i]<=money[j]) {
							flag=1;
							break;
						}
					}
					else {
						if(money[i]!=money[j]) {
							flag=1;
							break;
						}
					}
				}
				if(flag==1) {
					break;
				}
			}
		if(flag==1) {
			System.out.println("NOT FAIR");
		}
		else {
			System.out.println("FAIR");
		}
		
		
		}	
	}
	
	//Code for Freedom Fighter Question
	public static void freedomFighter() {
		 Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t--!=0) {
		    	int n=sc.nextInt();
		    	int p=sc.nextInt();
		    	ArrayList<Integer> list=new ArrayList<Integer>();
		    	for(int i=0;i<n;i++) {
		    		int x=sc.nextInt();
		    		list.add(x);
		    	}
		    	Collections.sort(list);
		    	int count=0;
		    	for(int i=0;i<n;i++) {
		    		if(list.get(i)<=p) {
		    			p=p-list.get(i);
		    			count=count+1;
		    		}
		    		else {
		    			break;
		    		}
		    	}
		    	System.out.println(count);
		    }
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int l=sc.nextInt();
			int r=sc.nextInt();
			int x=l*(l+1)*(l+2)*(l+3);
			int sum=x;
			int fin=l+3;
			for(int i=l+1;i<=r;i++) {
				fin++;
				int ini=(i-1);
				int result=(x*fin)/ini;
				x=result;
				sum=sum+result;
				
			}
			System.out.println(sum);
		}
	}
}
