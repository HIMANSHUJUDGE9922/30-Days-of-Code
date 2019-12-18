import java.util.*;
//Shahsakatras Programming Questions
public class Day_21 {

	public static void Questiion_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int count=0;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					
						float half=arr[i]/(float)2;
//						System.out.println(half);
						if(arr[j]>=half) {
							half=arr[j]/(float)2;
							if(arr[i]>=half) {
//								System.out.println(arr[i]+" "+arr[j]);
								count++;
							}
						}
						
					
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
			int d=sc.nextInt();
			String arr[]=new String[n];
			HashMap<String,Integer> map=new HashMap<String, Integer>();
			for(int i=0;i<n;i++) {
				arr[i]=sc.next();
			}
			for(int i=0;i<d;i++) {
				if(map.containsKey(arr[i])) {
					int y=map.get(arr[i]);
					y++;
					map.put(arr[i],y);
				}
				else {
					map.put(arr[i],1);
				}
			}
			int max=map.size();
			for(int i=d;i<n;i++) {
				int k=i-d;
				int y=map.get(arr[k]);
				if(y==1) {
					map.remove(arr[i]);
				}
				else {
					y--;
					map.put(arr[i],y);
				}
				if(map.containsKey(arr[i])) {
					int z=map.get(arr[i]);
					z++;
					map.put(arr[i],z);
				}
				else {
					map.put(arr[i],1);
				}
				if(map.size()>max) {
					max=map.size();
				}
			}
			
			System.out.println(max);
			
		}
	}
	
	public static void main(String[] args) {
	
       
		
	
	}
}
