import java.util.Scanner;

public class Day_3 {

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
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String str=sc.next();
    System.out.println(str);		

	}

}
