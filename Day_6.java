import java.util.Scanner;

public class Day_6 {

	//***************Geeks For Geeks Practice Question on Graphs********************//
	
	 //Function for calculating the dependency of th graph
	public static void countEdges(int edges[][]){
         boolean visited[]=new boolean[edges.length];
         int count=0;
         for(int i=0;i<edges.length;i++){
             for(int j=0;j<edges.length;j++){
                 if(edges[i][j]==1){
                     count++;
                 }
             }           
         }
     System.out.println(count);
     }
	
	
	public static void main(String[] args) {
	
	}

}
