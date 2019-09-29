import java.util.Stack;

public class M_Test_3 {
   public static void main(String[] args) {
	
	   
	   Stack<Character> stack=new Stack<Character>();
	   String input1= "[ :  ]";
	   int count=0;
	   for(int i=0;i<input1.length();i++) {
		
		   if(input1.charAt(i)=='{'||input1.charAt(i)=='[')
			stack.push(input1.charAt(i));
		   else if(input1.charAt(i)=='}') {
			   if(stack.size()==0) {
				   continue;
			   }
			   if(stack.peek()=='{') {
				   stack.pop();
				   count=count+1;
			   }
		   }
		   else if(input1.charAt(i)==']') {
			   if(stack.size()==0) {
				   continue;
			   }
			   if(stack.peek()=='[') {
				   stack.pop();
				   count=count+1;
			   }
		   }
	}
	 System.out.println(count);  
}
}
