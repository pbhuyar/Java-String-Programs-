// WAP to shift all  vowels at the end of String .

// 2) 2nd Approach 
// INPUT : Internationl
// OUTPUT : ntrntnlIeaio

class ShiftVowelsToEndOfString 
{
	public static void main (String args [] )
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder();
		String s2 =  "AEIOUaeiou";
		StringBuilder  vow = new StringBuilder();
for(int i=0;i<s1.length();i++)
	if(s2.contains(String.valueOf(s1.charAt(i))))
			vow.append(s1.charAt(i));
		else 
		sb.append(s1.charAt(i));
		sb.append(vow);
	System.out.println(sb);
	}
}
 