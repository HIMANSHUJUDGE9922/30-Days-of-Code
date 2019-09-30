import java.util.ArrayList;
import java.util.Scanner;

public class Day_3 {

	//Function for counting all the string that start with 1 and end with 1
	public static int countSubstring(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1') {
				count++;
			}
		}
	count=((count)*(count+1))/2;
	return count;
	}
	
	public static int minMoves(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min=list.get(i);
			}
		sum+=list.get(i);
		}
	return (sum)-(list.size())*(min);	
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0) {
    	int n=sc.nextInt();
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<n;i++) {
    		int x=sc.nextInt();
    		list.add(x);
    	}
    	System.out.println(minMoves(list));
    }

	}

}
