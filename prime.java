//check prime no or not at different ways
import java.util.Scanner;
class A
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		String str=" ";
		int r,i;
		int x[]=new int[100];
		r=sc.nextInt();
	//prime no print from 1 to n
		for(i=1;i<=r;i++)
		{
			int count=0;
	        for(int num=i;num>=1;num--)
	   	    {
			  if(i%num==0)
			  {
				count=count+1;
			  }
		    }

		      if(count==2)
		      {
		      	str=str+i+"    ";
		      }
	   }
       		System.out.println("PRIME NO FROM 1 TO 100 ARE");
   		   System.out.println(str+" ");
}
//only for one no check prime or not
/*
 for(i=2;i<=r/2;i++)
 {
 	if(r%i==0)
 	{
 		found=1;
         break;
     }
 }
 if(found==1)
 {
      System.out.println("no is prime");
 }
 else
 {
    System.out.println("not prime ");
 }

 */
}