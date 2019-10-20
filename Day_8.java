import java.lang.reflect.Array;
import java.util.*;

class Pair{
	int a,b;
	
	public Pair(int a,int b){
		this.a=a;
		this.b=b;
	}
}
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
	
	 //Question 2(HackerEarth Graphs)
	 public static void floodFill(int edges[][],int n,int m){
	        
	        boolean visited[][]=new boolean[n+1][m+1];
	        int max=0,count=0;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                if(edges[i][j]==1&&!visited[i][j]){
	                    visited[i][j]=true;
	                    count=count+1;
	                    int result=floodFill(edges,n,m,i,j,visited);
	                    if(result>max) {
	                    	max=result;
	                    }
	                }
	            }
	        }
	 System.out.println(count+" "+max);   
	 
	 }
	 public static int floodFill(int edges[][],int n,int m,int i,int j,boolean visited[][]){
	        int count=0;
	    	Pair k=new Pair(i,j);
	        Queue<Pair> queue=new LinkedList<Pair>();
	        queue.add(k);
	        while(!queue.isEmpty()){
	        	Pair z=queue.poll();
	        	count=count+1;
	            int x=z.a;
	            int y=z.b;
	            
	            //Case 1
	            if(x-1>=1&&y-1>=1&&edges[x-1][y-1]==1&&!visited[x-1][y-1]){
	            	Pair q=new Pair(x-1,y-1);
	            	visited[x-1][y-1]=true;
	            	queue.add(q);
	            }
	            
	            if(x-1>=1&&edges[x-1][y]==1&&!visited[x-1][y]) {
	            	Pair q=new Pair(x-1,y);
	            	visited[x-1][y]=true;
	            	queue.add(q);
	            }
	            
	            if(x-1>=1&&y+1<=m&&edges[x-1][y+1]==1&&!visited[x-1][y+1]){
	            	Pair q=new Pair(x-1,y+1);
	            	visited[x-1][y+1]=true;
	            	queue.add(q);
                }
	            
	            if(y-1>=1&&edges[x][y-1]==1&&!visited[x][y-1]) {
	            	Pair q=new Pair(x,y-1);
	            	visited[x][y-1]=true;
	            	queue.add(q);
                }
	            
	            if(y+1<=m&&edges[x][y+1]==1&&!visited[x][y+1]) {
	            	Pair q=new Pair(x,y+1);
	            	visited[x][y+1]=true;
	            	queue.add(q);
                }
	            
	            if(x+1<=n&&y-1>=1&&edges[x+1][y-1]==1&&!visited[x+1][y-1]) {
	            	Pair q=new Pair(x+1,y-1);
	            	visited[x+1][y-1]=true;
	            	queue.add(q);
                }
	            
	            if(x+1<=n&&edges[x+1][y]==1&&!visited[x+1][y]) {
	            	Pair q=new Pair(x+1,y);
	            	visited[x+1][y]=true;
	            	queue.add(q);
                }
	            
	            if(x+1<=n&&y+1<=m&&edges[x+1][y+1]==1&&!visited[x+1][y+1]) {
	            	Pair q=new Pair(x+1,y+1);
	            	visited[x+1][y+1]=true;
	            	queue.add(q);
                }
	        }
	    
	    return count;
	    }
	 
	 //Question 3(HackerEarth Graphs)
	 public static void fuelFill(){
		 Scanner sc=new Scanner(System.in);
		 
		 int count=0;
		 
		 int n=sc.nextInt();
		 int x=sc.nextInt();
		 
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			list.add(a);
		 }
		 
		 for(int i=0;i<n;i++) {
			 if((x-list.get(i))>=0) {
				 count=count+1;
				 x=x-list.get(i);
			 }
		 }
		 System.out.println(count+1);
		 
	 }
	 

	 public static void main(String[] args) {
		
		 
	}

}
