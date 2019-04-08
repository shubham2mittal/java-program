import java.util.*;
class A
{
	public static void main(String []args)
	{
	   Scanner sc=new Scanner(System.in);
	   int i=0;
	   int r=0;
	   System.out.println("enter the decimal no");

	    i=sc.nextInt();
	   /*
	   //DIRECT CONVERSION FROM DECIMAL TO OCTAL;
	   String octal=Integer.toOctalString(i);
	   System.out.println("octal no is:"+octal);
	   //DIRECT CONVERSION FROM DECIMAL TO HEXA;
	   String HEXA=Integer.toHexString(i);
	   System.out.println("hexa no is:"+HEXA);
	   //DIRECT CONVERSION FROM DECIMAL TO BINARY;
	   String binary=Integer.toBinaryString(i);
	   System.out.println("binary no is:"+binary);

	 */

/*
	  //INDIRCT CONVERSION DECIMAL TO OCTAL
	   	   String str="";
	   char dig[]={'0','1','2','3','4','5','6','7'};
	   while(i!=0)
	  {
	  	r=i%8;
	  	str=dig[r]+str;
	    i=i/8;
	  }
	  System.out.println(str);
	//INDIRCT CONVERSION DECIMAL TO HEXA DECIMAL
	   */

	   String str="";
	   char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   while(i!=0)
	  {
	  	r=i%16;
	  	str=dig[r]+str;
	    i=i/16;
	  }
	  System.out.println(str);
	}
}