
// WAP to count Vowels in the String..

// 1) 3RD Approach 

class CountVowels3
{
	public static void main (String args [] )
	{
		String s1 = "International";
		String s2 = s1.toUpperCase();
		int count =0;
		for (int i=0;i<s1.length();i++)
		{
		int c =s2.charAt(i);
		if( c== 'A' || c == 'E' || c =='I' ||
		   c == 'O' || c== 'U')
		count++;
		}
		System.out.println(count);
	}
}

