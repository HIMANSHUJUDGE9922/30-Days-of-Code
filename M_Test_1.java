import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class M_Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=4;
		int input2[]= {2,1,2,1};
int half=(input1)/2;
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<input2.length;i++) {
        	if(map.containsKey(input2[i])) {
        		int x=map.get(input2[i]);
        		if(x+1>half) {
        			list.add(input2[i]);
        			x=x+1;
        			map.replace(input2[i],x);
        		}
        		else {
        			x=x+1;
        			map.replace(input2[i],x);
        		}
        	}
        	else {
        		map.put(input2[i],1);
        	}
        }
		if(list.size()==0) {
			System.out.println("-1");
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
