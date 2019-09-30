import java.util.ArrayList;
import java.util.HashMap;
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
	
	//Function for making all number equal
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
	
	//Function for CopyPaste Question Codechef
	public static int copyPaste(ArrayList<Integer> list) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<list.size();i++) {
			if(map.containsKey(list.get(i))){
				
			}
			else {
				map.put(list.get(i),1);
				count++;
			}
		}
	return count;
	}
	
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String str=sc.next();
		char arr[]=new char[26];
		for(int i=0;i<26;i++) {
			arr[i]=str.charAt(i);
		}
		
		while(t--!=0) {
	String input=sc.next();
	String result="";
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)>='a'&&input.charAt(i)<='z') {
			int k=input.charAt(i)-'a';
			result=result+arr[k];
		}
		else if(input.charAt(i)>='A'&&input.charAt(i)<='Z') {
			int k=input.charAt(i)-'A';
			char ch=arr[k];
			k=ch-32;
			ch=(char)k;
			result=result+ch;
		}
		else if(input.charAt(i)=='_') {
			result=result+" ";
		}
		else {
			result+=input.charAt(i);
		}
	}
		System.out.println(result);
	}
 }
}
