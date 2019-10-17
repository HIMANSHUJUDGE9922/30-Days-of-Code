import java.util.*;
public class Day_7 {

	
	 //Question 1(HackerEarth Graphs)
	 public static void findMin(int edges[][],int n){
	        boolean visited[]=new boolean[n+1];
	        int weight[]=new int[n+1];
	        
	        for(int i=1;i<=n;i++){
	            weight[i]=Integer.MAX_VALUE;
	        }
	        
	        visited[1]=true;
	        weight[1]=0;
	        findMin(edges,n,1,visited,weight);
	        System.out.println(weight[n]);
	    }
	 public static void findMin(int edges[][],int n,int sv,boolean visited[],int weight[]){
	        for(int i=1;i<=n;i++){
	            if(edges[sv][i]==1&&!visited[i]){
	                int dist=weight[sv]+1;
	                if(weight[i]>dist){
	                    weight[i]=dist;
	                }
	            }
	        }
	        
	        int pos=-1;
	        int min=Integer.MAX_VALUE;
	        for(int i=1;i<=n;i++){
	            if(!visited[i]&&weight[i]<min){
	                min=weight[i];
	                pos=i;
	            }
	        }
	        if(pos==-1)
	        return;
	        visited[pos]=true;
	        findMin(edges,n,pos,visited,weight);
	    }
	 
	 //Question 1(HackeEarth Graphs)
	 public static void BFS(int edges[][],int n){
		 boolean visited[]=new boolean[n+1];
		 Queue<Integer> queue=new LinkedList<Integer>();
		 queue.add(1);
		 visited[1]=true;
		 int flag=0,count=0;
		 
		 
		 while(!queue.isEmpty()){
			 int size=queue.size();
			 count++;
			 for(int j=0;j<size;j++){
			       int frontNode=queue.poll();
			       for(int i=1;i<=n;i++) {
				           
			    	       if(edges[frontNode][i]==1&&!visited[i]) {
					                queue.add(i);
					                  visited[i]=true;
					                        if(i==n) {
						                       flag=1;
						                           break;
					                        }
					      }
			     }
			       
			       if(flag==1)
				      break;
	        }
			if(flag==1)
				break;
			 
		 }		 
		 System.out.println(count);
	 }
	
	 //Question 2(HackerEarth Graphs)
	 public static void social(int edges[][],int n,int sv,int t){
		 boolean visited[]=new boolean[n];
		 int count=0;
		 
		 Queue<Integer> queue=new LinkedList<Integer>();
		 
		 queue.add(sv);
		 visited[sv]=true;
		 
		 while(!queue.isEmpty()){
		     
		     int size=queue.size();
		     count++;
		     for(int i=0;i<size;i++){
		         
		         int frontNode=queue.poll();
		         for(int j=0;j<n;j++){
		             if(!visited[j]&&edges[frontNode][j]==1){
		                 queue.add(j);
		                 visited[j]=true;
		             }
		         }
		     }
		     if(count==t){
		         break;
		     }
		 }
		 System.out.println(queue.size());
	}
	
	 public static void main(String[] args) {
         
		 Scanner sc=new Scanner(System.in);
         //Vertices
         int n=sc.nextInt();
         //Edges
         int e=sc.nextInt();
         //Adjacency Array
         int edges[][]=new int[n][n];
         for(int i=0;i<e;i++){
             int sv=sc.nextInt();
             int ev=sc.nextInt();
             edges[sv][ev]=1;
             edges[ev][sv]=1;
         }
         int m=sc.nextInt();
         while(m--!=0){
             int sv=sc.nextInt();
             int t=sc.nextInt();
             social(edges,n,sv,t);
             
         }	 
		 
		 

	}

}
