import java.io.*;
class A
{
 public static void main(String args[]) throws IOException
 {
 	FileInputStream fis=new FileInputStream("a.txt");
 	FileInputStream fis1=new FileInputStream("b.txt");
 	FileOutputStream fos=new FileOutputStream("c.txt");
     int n;
     try
     {
     	while((n=fis.read())!=-1)
     	{
     	  fos.write(n);
     	}
        while((n=fis1.read())!=-1)
     	{
     	  fos.write(n);
     	}
     fis.close();
     fis1.close();
     fos.close();
     }
     catch(FileNotFoundException e)
     {
     	System.out.println("no run");
     	System.exit(1);
     }
 }
}