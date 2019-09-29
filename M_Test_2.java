import java.util.ArrayList;
import java.util.Collections;

public class M_test_2 {

	public static void main(String[] args) {
		int input3[]= {1,4,2,6};
		int input2=3;
		ArrayList<Integer> list=new ArrayList<Integer>();

        
		for(int i=0;i<input3.length;i++){
			list.add(input3[i]);
		}
		Collections.sort(list);
		int count=0,sum=0;
		for(int i=list.size()-1;i>=0;i--){
			if(count==input2) {
				break;
			}
			sum=sum+list.get(i);
		   count=count+1;
		}
        System.out.println(sum);
	}

}
