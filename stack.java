import java.util.Scanner;
class A
{
  	  static int top=-1;
  	  static int stack[]=new int[10];
  	  public static void push(int item)
  	  {
  	    if(top==(stack.length))
  	    {
  	      System.out.println("stack is overflow");
  	    }
  	    else
  	    {
  	    	top++;
  	    	stack[top]=item;
  	       System.out.println("element is entered");
  	    }
  	  }
  	  public static int pop()
      {
        int x;
        if(top<0)
        {
         System.out.println("Stack is underflow");
         return 0;
        }
        else
        {
  	     x=stack[top];
  	     top--;
  	     return x;
        }
      }
  	  public static void display()
      {
        int i;
        System.out.println("stack is");
        for(i=top;i>=0;i--)
        System.out.println(stack[i]);
      }
     public static void main(String args[])
     {
         int n,k;
         Scanner sc=new Scanner(System.in);
         while(true)
        {
          System.out.println("1.push 2.pop 3.display 4.exit");
          k=sc.nextInt();
           switch(k)
         {
          case 1:
  	      System.out.println("enter the no");
  	      n=sc.nextInt();
  	      push(n);
          break;
          case 2:
  	      System.out.println("pop item is"+pop());
          break;
         case 3:
  	     display();
          break;
         case 4:
         System.exit(1);
         break;
         default :
   	      System.out.println("enter valid choice");
     }
    }
 }
}