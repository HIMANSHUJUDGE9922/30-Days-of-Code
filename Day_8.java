import java.util.*;
public class Day_8 {

	
	 //Question 1(HackerEarth Graphs)
	 public static void DFS(int edges[][],int n){
	        boolean visited[]=new boolean[n+1];
	        
	        int sv=1;
	        visited[sv]=true;
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        for(int i=1;i<=n;i++){
	            if(edges[sv][i]!=-1&&!visited[i]){
	                visited[i]=true;
	                printDFS(edges,n,i,edges[sv][i],visited,list);
	            }
	        }
	 System.out.println(list.size());   
	 }
	 public static void printDFS(int edges[][],int n,int sv,int xor,boolean visited[],ArrayList<Integer> list){
	        int count=0;
	        for(int i=1;i<=n;i++){
	            if(!visited[i]&&edges[sv][i]!=-1){
	                count=count+1;
	                int new_xor=xor^edges[sv][i];
	                visited[i]=true;
	                printDFS(edges,n,i,new_xor,visited,list);
	            }
	        }
	        if(count==0){
	            if(xor%2!=0){
	                list.add(1);
	            }
	        }
	    }
	
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	       
		  int t=sc.nextInt();
	       
	       while(t--!=0){
	           int n=sc.nextInt();
	           int edges[][]=new int[n+1][n+1];
	           for(int i=1;i<=n;i++) {
	        	   for(int j=1;j<=n;j++) {
	        		  edges[i][j]=-1;
	        	   }
	           }
	           for(int i=1;i<n;i++){
	               int sv=sc.nextInt();
	               int ev=sc.nextInt();
	               int w=sc.nextInt();
	               edges[sv][ev]=w;
	               edges[ev][sv]=w;
	           }
	           
	          DFS(edges, n); 
	       }

	}

}
