//REVERSE A NO USING WHILE LOOP,FOR LOOP AND RECURSION
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 int num=0;
	 int reverseno=0;
	 num=sc.nextInt();
	 recursion(num);
	 //using while loop
	 /*
	 while(num!=0)
	 {
	 	reverseno=num%10;
	    System.out.print(reverseno);
	    num=num/10;

	}
	*/
	//USING FOR LOOP
/*
	 for(;num!=0;)
	 {
	   reverseno=reverseno*10;
	   reverseno=reverseno+num%10;
	   num=num/10;
	 }
      System.out.print(reverseno);
*/
	//USING RECURSION
	}
	public static void recursion(int number)
	{
		if(number<10)
		{
			 System.out.print(number%10);
		}
	    else
	    {
	    	 System.out.print(number%10);
	    	 recursion(number/10);
	    }
	}


}