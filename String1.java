

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


	1) 1st Appraoch By using simple one for loop
	*/ 
class String1
{
	public static void main (String args [] )
	{
		String s1 = "Engineer";
		for(int i=0;i<s1.length();i++)
		System.out.println(s1.substring(0,i+1));
	}
}
	