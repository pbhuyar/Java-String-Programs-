
// WAP to count Vowels in the String..

// 1) 2ND  Method 

class CountVowels2
{
	public static void main (String args [] )
	{
		String s1 = "International";
		int count =0;
		for (int i=0;i<s1.length();i++)
		{
		int c =s1.charAt(i);
		if( c== 'A' || c =='a' || c == 'E' || c == 'e' ||c =='I' || c == 'i' || c == 'O' || c =='o' || c== 'U' || c =='u')
	count++;
		}
	System.out.println(count);
	}
}

