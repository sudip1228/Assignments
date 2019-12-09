package assignment1;

public class Number2 {

	public static void main(String[] args) {
		//Swap two numbers using third variable as result name and do the same task without using any third variable.

	
		
		int a= 5;
		int b= 6;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(b);
		System.out.println(a);
		swappingWithoutVariable();	
	}
	
	static void swappingWithoutVariable()
	{
		int a=10;
		int	b=11;
		a=a+b;//21
		b=a-b;//10
		a=a-b;//11
		
		System.out.println(a);
		System.out.println(b);
}
}
