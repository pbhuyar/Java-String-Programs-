
/*
 WAP to count spacial Chraracters present in the String 


 INPUT : "hello nayan,,.where is nikhil?? kartik looking
	    for him !!!" ;

// OUTPUT : 7;

*/
class CountSpacialCharacters 
{
	public static void main (String args [] )
	{
		String s1 = "hello nayan,,.where is nikhil?? kartik looking for him !!!" ;
		int count  =0;
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(!(Character.isLetterOrDigit(c)||Character.isWhitespace(c)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
		

