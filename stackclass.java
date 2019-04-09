//CHECK THAT STRING IS PALINDROM OR NOT USING STACK CLASS
import java.util.Stack;
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the string");
		Stack s1=new Stack();
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			s1.push(s.charAt(i));
		}
	    String reverse="";
	    while(!s1.isEmpty())
	    {
	    	reverse=reverse+s1.pop();
	    }
	    if(s.equals(reverse))
	    {
	    	System.out.println("string is palindrom");
	    }
	    else
	    {
	    	System.out.println("string is not palindrom");
	    }
	}
}