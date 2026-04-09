	package pekan3_2511533024;
	import java.util.Scanner;
	import java.util.Stack;
	public class stackPostfix_2511533024 {
	 public static int PostfixEvaluate_2511533024(String expresion) {
		 Stack<Integer> s_3024= new Stack<Integer>();
		 Scanner input =new Scanner (expresion);
		 while (input.hasNext()) {
			 if (input.hasNext()) {
				 s_3024.push(input.nextInt());
			 } else {
				 String operator = input.next();
				 int operand2 = s_3024.pop();
				 int operand1 = s_3024.pop();
				 if (operator.equals("+")) {
					 s_3024.push(operand1 + operand2);
				 }else if (operator.equals("-")) {
				    s_3024.push(operand1 - operand2);
				  }else if (operator.equals("-")) {
					    s_3024.push(operand1 - operand2);
				  }else {
					  s_3024.push(operand1 / operand2);
				  }
			 }
		 }
		 input.close();
		 return s_3024.pop();
	 }
	 public static void main (String [] args) {
		 System.out.println(" hasil postfix = " +PostfixEvaluate_2511533024 ("5 2 4 * + 7 -"));
	 }
 }
