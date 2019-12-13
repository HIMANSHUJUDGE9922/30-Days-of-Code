import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class September {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			int x=sc.nextInt();
			list.add(x);
		}
		int i=0,flag=0;
		while(i<m) {
			HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
			int j=0+i;
			while(j<n+i&&j<m) {
				if(map.containsKey(list.get(j))) {
					flag=1;
					break;
				}
				else {
					map.put(list.get(j),1);
				}
			j++;
			}
		if(flag==1) {
			break;
		}
	  i=i+n;	
	}
 if(flag==1) {
	 System.out.println("NO");
 }
 else {
	 System.out.println("YES");
 }

}
	}

}
