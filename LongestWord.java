 
// WAP to find longest word from the string 

// INPUT : Welcome to the International Airport 
// OUTPUT : International 

class LongestWord 
{
	public static void main (String args [] )
	{
	String s1 = "Welcome to the International Airport";
	String s2 [] = s1.split(" ");
	int size =0;
	for(int i=0;i<s2.length;i++)
		{
			if(size<s2[i].length())
			{
				 size =s2[i].length();
			}
		}
	for(int i=0;i<s2.length;i++)
			if(size == s2[i].length())
		System.out.println(s2[i]);
	}
}
 