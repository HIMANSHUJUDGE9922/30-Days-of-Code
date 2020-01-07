import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class item{
	int value,index,loss;
	public item(int value,int index){
		this.value=value;
		this.index=index;
		this.loss=0;
	}
	public  void setValue(int x) {
		this.loss=x;
	}
}

public class Day_24 {

	public static void Question_1() {
Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[9];
		int item[]=new int[9];
		
		for(int i=1;i<=8;i++) {
			arr[i]=sc.nextInt();
			item[i]=i;
		}
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=8-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					temp=item[j];
					item[j]=item[j+1];
					item[j+1]=temp;
				}
			}
		}
		
		
		
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i=1;i<=8;i++) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			map.put(i,list);
		}
		
		int q=sc.nextInt();
		while(q--!=0) {
			
			int l=sc.nextInt();
			int r=sc.nextInt();
			ArrayList<Integer> list=map.get(l);
			list.add(r);
			map.put(l,list);
			list=map.get(r);
			list.add(l);
			map.put(r,list);
			
		}
		int count=0;
		for(int i=1;i<=8;i++) {
			if(arr[i]!=-1) {
				count=count+arr[i];
				ArrayList<Integer> list=map.get(item[i]);
				for(int j=0;j<list.size();j++) {
					for(int k=1;k<=8;k++) {
						if(item[k]==list.get(j)) {
							arr[k]=-1;
							break;
						}
					}
				}
			}
		}
		
		System.out.println(count);
	}

	public static void Question_2() {

		Scanner sc=new Scanner(System.in);
		ArrayList<item> list=new ArrayList<item>();
		for(int i=1;i<=8;i++) {
			int x=sc.nextInt();
			item t=new item(x,i);
			list.add(t);
		}
		
    
	  HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i=1;i<=8;i++) {
			ArrayList<Integer> list2=new ArrayList<Integer>();
			map.put(i,list2);
		}
		int q=sc.nextInt();
		while(q--!=0) {
			
			int l=sc.nextInt();
			int r=sc.nextInt();
			ArrayList<Integer> list2=map.get(l);
			list2.add(r);
			map.put(l,list2);
			ArrayList<Integer> list3=map.get(r);
			list3.add(l);
			map.put(r,list3);
		}
		
		int lossArr[]=new int[8];
		
		for(int i=0;i<8;i++) {
			lossArr[i]=0;
			ArrayList<Integer> list_2=map.get(list.get(i).index);
			for(int j=0;j<list_2.size();j++) {
				for(int k=0;k<8;k++) {
					if(list.get(k).index==list_2.get(j)) {
						lossArr[i]+=list.get(k).value;
						break;
					}
				}
			}
		 list.get(i).setValue(lossArr[i]);	
		}
		
		
		
		Arrays.sort(lossArr);
		int count=0;
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(list.get(j).loss==lossArr[i]) {
					if(list.get(j).value!=-1) {
						count=count+list.get(j).value;
						ArrayList<Integer> list_2=map.get(list.get(j).index);
						for(int k=0;k<list_2.size();k++) {
							for(int l=0;l<8;l++) {
								if(list.get(l).index==list_2.get(k)) {
									list.get(l).value=-1;
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
		
		
	}
	
	public static void main(String[] args) {
		

		
	}
}
