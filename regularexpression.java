import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
class regexexp
{
   public static void main(String args[])
 	{
	Pattern pat = Pattern.compile("test");
	Matcher mat = pat.matcher("test 1 2 3 test");


 	while(mat.find())
	{
		System.out.println(mat.group()+" first index is "+mat.start()+ "last index is not"+(mat.end()-1));
	}
 	}


}
class regexp2
{
	 public static void main(String args[])
  	{
	 Pattern pat = Pattern.compile("w+");
	 Matcher mat = pat.matcher("w ww www");


 	 while(mat.find())
    	{
		System.out.println(mat.group()+" first index is "+mat.start()+ "last index is not"+(mat.end()-1));
	 }
 	}
}
class regexp2
{
	 public static void main(String args[])
  	{
	 Pattern pat = Pattern.compile("w?");
	 Matcher mat = pat.matcher("w ww www");
      Pattern pat = Pattern.compile("w*");
	 Matcher mat = pat.matcher("w ww www");


 	 while(mat.find())
    	{
		System.out.println(mat.group()+" first index is "+mat.start()+ "last index is not"+(mat.end()-1));
	 }
 	}
}*/
class regexp2
{
	 public static void main(String args[])
  	{
	 Pattern pat = Pattern.compile("t.+?t");
	 Matcher mat = pat.matcher("test 1 2 3 test");

//     Pattern pat = Pattern.compile("t.+t");
//	 Matcher mat = pat.matcher("test 1 2 3 test");

// Pattern pat = Pattern.compile("t.{2}t");
//	 Matcher mat = pat.matcher("test 1 2 3 test");

 	 while(mat.find())
    	{
		System.out.println(mat.group()+" first index is "+mat.start()+ "last index is not"+(mat.end()-1));
	 }
 	}
}