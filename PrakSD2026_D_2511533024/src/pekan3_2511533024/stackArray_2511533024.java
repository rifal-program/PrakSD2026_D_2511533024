	package pekan3_2511533024;
	
	public class stackArray_2511533024 {
	static final int MAX_3024 = 1000;
	int top_3024;
	int a_3024 [] = new int [MAX_3024];
	boolean isEmpty_2511533024()
	{
		return (top_3024 < 0);
	}
	stackArray_2511533024()
	{
		top_3024 = -1;
	}
	boolean push (int x)
	{
		if (top_3024 >= ( MAX_3024 -1)) {
			System.out.println("stack overflow");
			return false;
		}
		else {
			a_3024[++top_3024] = x;
			System.out.println(x +"dimasukan dalama stack ");
			return true;
		}
	}
	int pop() 
	{
		if (top_3024 < 0) {
			System.out.println("stack underflow");
			return 0;
		}
	else {
		int x = a_3024[top_3024--];
		return x;
	}
	}
	int peak()
	{
		if (top_3024 < 0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = a_3024[top_3024];
			return x;
		}
	}
	void print() {
		for (int i = top_3024;i>-1;i++) {
			System.out.print(" "+ a_3024[i]);
		}
	}
}
