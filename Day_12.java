import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Day_12 {

	//Code Forces Question1 
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0) {
		String str=sc.next();
		ArrayList<Character> list=new ArrayList<Character>();
 		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();) {
			if(i+1<str.length()) {
				if(str.charAt(i)==str.charAt(i+1)) {
					i=i+2;
				}
				else {
					if(!map.containsKey(str.charAt(i))) {
						map.put(str.charAt(i),1);
						list.add(str.charAt(i));
					}
				i++;
				}
			}
			else {
				if(!map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i),1);
					list.add(str.charAt(i));
				}
			i++;
			}
		}
      Collections.sort(list);
      for(int i=0;i<list.size();i++) {
    	  System.out.print(list.get(i));
      }
      System.out.println();
	
	
	}
	}
	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0) {
	    	 long n=sc.nextLong();
	    	 String str=String.valueOf(n);
	    	 ArrayList<Integer> list=new ArrayList<Integer>();
	    	 for(int i=0;i<str.length();i++) {
	    		 list.add(str.charAt(i)-'0');
	    	 }
	    	 for(int j=0;j<list.size();j++) {
	    	 for(int i=0;i<list.size();i++) {
	    		 if(i+1<list.size()) {
	    			 if(list.get(i)>list.get(i+1)) {
	    				int r1=list.get(i)%2;
	    				int r2=list.get(i+1)%2;
	    				if(r1!=r2) {
	    					int temp=list.get(i);
	    					list.set(i,list.get(i+1));
	    					list.set(i+1,temp);
	    				}
	    			 }
	    		 }
	    	 }
	    	 }
	    	 for(int i=0;i<list.size();i++) {
	    		 System.out.print(list.get(i));
	    	 }
	    	 System.out.println();
	    }
		
		
		
	}
}
