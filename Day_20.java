import java.util.HashMap;
import java.util.Scanner;

public class Day_20 {

	
	//All Codes for Substring A and B of Deember Long Challenge
	
	public static void Question_1() {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0) {
//		int n=sc.nextInt();
		
	    String str=sc.next();
        int max=0;
        HashMap<Character,Boolean> map=new HashMap<Character, Boolean>();
        boolean result=false;
        for(int i=0;i<str.length();){
           if(map.containsKey(str.charAt(i))){
//        	  System.out.println("ans");
        	  result=true; 
           }
           else {
        	   map.put(str.charAt(i),true);
           }
           
            if((i<str.length()-1)&&(str.charAt(i)==str.charAt(i+1))){
               int lower_index=i,right_index=i+1;
               int j=i+1;
               
               while((j<str.length())&&(str.charAt(lower_index)==str.charAt(j))){
            	   right_index=j;
            	   j++;          
               }
//               System.out.println(str.charAt(lower_index)+" "+lower_index+" "+right_index);
              int ans_left=right_index;
              int ans_right=str.length()-i-1;
              max=Math.max(ans_left,ans_right);
               
               i=right_index;
               continue;
            }
        i++;
        }
        if(max==0&&result==true) {
        	max=1;
        }
        System.out.println(max);
	    }		
	}
	
	public static void tryQuestion_1() {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0) {
//		int n=sc.nextInt();
		
	    String str=sc.next();
        int max=0;
        HashMap<Character,Boolean> map=new HashMap<Character, Boolean>();
        boolean result=false;
        for(int i=0;i<str.length();){
           if(map.containsKey(str.charAt(i))){
//        	  System.out.println("ans");
        	  result=true; 
           }
           else {
        	   map.put(str.charAt(i),true);
           }
           
            if((i<str.length()-1)&&(str.charAt(i)==str.charAt(i+1))){
               int lower_index=i,right_index=i+1;
               int j=i+1;
               
               while((j<str.length())&&(str.charAt(lower_index)==str.charAt(j))){
            	   right_index=j;
            	   j++;          
               }
//              System.out.println(str.charAt(lower_index)+" "+lower_index+" "+right_index);
              int left=lower_index;
              int right=str.length()-right_index-1;
              int ans=(right_index-lower_index)+left+right;
              if(ans>max) {
            	  max=ans;
              }
//               System.out.println("Max"+" "+max);
               i=right_index;
               continue;
            }
        i++;
        }
        if(max==0&&result==true) {
        	max=1;
        }
        System.out.println(max);
	    }
	}
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0) {
	    	int n=sc.nextInt();
	    	String str=sc.next();
	    	int ans=0;
	    	for(int i=0;i<n-1;i++) {
	    		if(str.charAt(i)==str.charAt(i+1)){
	    			ans=n-1;
	    			break;
	    		}
	        }
	    	if(ans==0) {
	    		
	    		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
	    		for(int i=0;i<n;i++) {
	    			if(map.containsKey(str.charAt(i))) {
	    				int index=map.get(str.charAt(i));
	    				int left=index;
	    				int right=str.length()-i;
	    				ans=left+right;
	    				break;
	    			}
	    			else {
	    				map.put(str.charAt(i),i);
	    			}
	    		}
	        }
	    	System.out.println(ans);
	    	
	    }
		
		
	}

}
