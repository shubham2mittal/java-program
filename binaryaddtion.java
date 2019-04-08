//BIARY ADDITION OF TWO NO
import java.util.Scanner;
class A
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int b1=0,b2=0;
		int carry=0;
		int sum[]=new int[10];
		int i=0;
		System.out.println("enter first binary digit");
		b1=sc.nextInt();
		System.out.println("enter second binary digit");
		b2=sc.nextInt();
		while(b1!=0 || b2!=0)
		{
			sum[i++]=((b1%10+b2%10+carry)%2);
		    carry=((b1%10+b2%10+carry)/2);
		    b1=b1/10;
		    b2=b2/10;
		}
	    if(carry!=0)
	    {
	  	 sum[i]=carry;
	    }
/*
	    while(i>=0)
	    {
	    	System.out.print(sum[i--]);
	    }
*/
        for(i=5;i>=0;i--)
        {
        	System.out.print(sum[i]);
        }
	}
}