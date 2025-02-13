/*
 INPUT : Engineer 
 OUTPUT :   E
	    En
	    Eng
	    Engi
	    Engin
	    Engine
	    Enginee
	    Engineer


	1) 2nd Appraoch By using two for loop
*/ 

class String2
{
	public static void main (String args [] )
	{
		String s1 = "Engineer";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s1.charAt(j));
			}
		System.out.println();
		}
	}
}