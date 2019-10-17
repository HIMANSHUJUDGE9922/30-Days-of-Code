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
	
	 //Question 3(HackerEarth Graphs)
	 public static void BFSPath(int edges[][],int n,int x,int y){
	        int flag=0;
	        boolean visited[]=new boolean[n+1];
	        int parent[]=new int[n+1];
	        for(int i=1;i<=n;i++){
	            parent[i]=i;
	        }
	        Queue<Integer> queue=new LinkedList<Integer>();
	        queue.add(x);
	        visited[x]=true;
	        
	        while(!queue.isEmpty()){
	        
	             int frontNode=queue.poll();
	             for(int i=1;i<=n;i++){
	                 if(edges[frontNode][i]==1&&!visited[i]){
	                     parent[i]=frontNode;
	                     queue.add(i);
	                     visited[i]=true;
	                     if(i==y){
	                         flag=1;
	                         break;
	                     }
	                 }
	             }
	        
	            if(flag==1)
	              break;
	        }
	     
	     ArrayList<Integer> list=new ArrayList<Integer>();
	       
	     printBFSPath(parent,x,y,list);
	     System.out.println(list.size());
	     
	     for(int i=list.size()-1;i>=0;i--){
	         System.out.print(list.get(i)+" ");
	     }
	     
	    }
	 public static void printBFSPath(int parent[],int x,int v,ArrayList<Integer> list){
	       if(parent[v]==v&&parent[v]==x&&v==x){
	           list.add(v);
	           return;
	       }
	       list.add(v);
	       printBFSPath(parent,x,parent[v],list);
	    }    
	 
	 //Question 4(HackerEarth Graphs)
	 public static void Dhoom4() {
		 Scanner sc=new Scanner(System.in);
	       int s_val=sc.nextInt();
	       int r_val=sc.nextInt();
	       int n=sc.nextInt();
	       ArrayList<Integer> list=new ArrayList<Integer>();
	       for(int i=0;i<n;i++){
	           int x=sc.nextInt();
	           list.add(x);
	       }
	       
	       Queue<Integer> queue=new LinkedList<Integer>();
	       HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	       map.put(s_val,0);
	       queue.add(s_val);
	       
	       while(!queue.isEmpty()){
	    	   
	           int frontNode=queue.poll();
	           
	           for(int i=0;i<n;i++){
	               int z=(((frontNode)%100000)*((list.get(i))%100000))%100000;
	               queue.add(z);
	               if(!map.containsKey(z)) {
	            	   map.put(z,map.get(frontNode)+1);
	               }
	               if(z==r_val){
	                  System.out.println(map.get(z));
	                  return;
	               }
	           }
	          
	        }
	       
	            
	       System.out.println(-1);
		 
	 }
	 
	 //Question 5(HackeEarth Graphs)
	  public static void findPath(int arr[][],int xi,int yi,int x,int y,int n,int m){
	        int storage[][]=new int[n+1][m+1];
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=m;j++){
	                storage[i][j]=-1;
	            }
	        }
	        boolean visited[][]=new boolean[n+1][m+1];
	        
	        
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        
	        int result=findPath(arr,xi,yi,x,y,n,m,storage,visited,list);
	        System.out.println(list.size()+" "+result);  
	  }
	  public static int findPath(int arr[][],int xi,int yi,int x,int y,int n,int m,int storage[][],boolean visited[][],ArrayList<Integer> list){
	    	 
	    	if(x==xi&&y==yi){
	    		    list.add(arr[x][y]);
		            visited[x][y]=true;
	    		    storage[x][y]=arr[x][y];
		            return storage[x][y];
		    }
	        if(x<=0||x>n||y<=0||y>m){
	            return Integer.MAX_VALUE;
	        }
	        if(arr[x][y]==-6) {
	        	return Integer.MAX_VALUE;
	        }
	        if(visited[x][y]==true) {
	        	return Integer.MAX_VALUE;
	        }
	        
	       
	        
	        if(storage[x][y]!=-1){
	            return storage[x][y];
	        }
	        
	        visited[x][y]=true;
	        int option1,option2,option3,option4=Integer.MAX_VALUE;
	        option1=option2=option3=option4;
	        
	                        
	               option1=findPath(arr,xi,yi,x-1,y,n,m,storage,visited,list);
	         	   option2=findPath(arr,xi,yi,x,y+1,n,m,storage,visited,list);
	               option3=findPath(arr,xi,yi,x+1,y,n,m,storage,visited,list);
	               option4=findPath(arr,xi,yi,x,y-1,n,m,storage,visited,list);
	         
	          storage[x][y]=arr[x][y]+Math.min(option1,Math.min(option2,Math.min(option3,option4)));
	          list.add(storage[x][y]); 
	        return storage[x][y];
	    }
	 
	 
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int m=sc.nextInt();
	       
	       int arr[][]=new int[n+1][m+1];
	       
	       for(int i=1;i<=n;i++){
	           for(int j=1;j<=m;j++){
	               char ch=sc.next().charAt(0);
	               arr[i][j]=ch-48;
	           }
	       }
	       
	       int x=sc.nextInt();
	       int y=sc.nextInt();
	       int q=sc.nextInt();
	       while(q--!=0){
	         int xi=sc.nextInt();
	         int yi=sc.nextInt();
	         findPath(arr,xi,yi,x,y,n,m);
	       }
		

	}

}
