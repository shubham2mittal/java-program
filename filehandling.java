import java.io.*;
class A
{
	public static void main(String args[]) throws IOException
	{

	  try
	  {
	  FileInputStream fis=new FileInputStream("a.txt");
      FileOutputStream fos=new FileOutputStream("b.txt");
       int n;
      while((n=fis.read())!=-1)
      {
      	fos.write(n);
        //n=fis.read();
      }
	   fis.close();
	  fos.close();
	  }
       catch(FileNotFoundException e)
       {
       	 System.out.println("run not");
       	 System.exit(1);
       }
   }
}