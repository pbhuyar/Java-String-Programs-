

// WAP to shift all  vowels at the end of String .

// 1) 1st Approach 
// INPUT : Internationl
// OUTPUT : ntrntnlIeaio


class AddVowelsAtEnd
{
	public static void main (String args [] )
	{
		String s1 = "Internationl";
		StringBuilder sb = new StringBuilder();
		String s2 = "AEIOUaeiou";
		for(int i=0;i<s1.length();i++)
			{
       				if(! s2.contains(String.valueOf(s1.charAt(i))))
					{
						sb.append(s1.charAt(i));
					}
			}
		for( int i=0;i<s1.length();i++)
 		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
				{
					sb.append(s1.charAt(i));
				}
		}
		System.out.println(sb);
	}
}
		