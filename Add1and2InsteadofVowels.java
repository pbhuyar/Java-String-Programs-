
// WAP to Add 1 and 2 in the place of Vowels in the String.

// INPUT : "International ";
// OUTPUT : 1nt2rn1t21n2l ;


class Add1and2InsteadofVowels  
{
	public static void main (String args [] )
	{
	String s1 = "International";
	String s2 = "AEIOUaeiou";
	StringBuilder sb = new StringBuilder();
	int count =0;
	for (int i=0;i<s1.length();i++)
	if (s2.contains(String.valueOf(s1.charAt(i))))
	{
		if(count %2==0)
	        	sb.append(1);
		else 
			sb.append(2);
			count ++;
	}
	else 
		sb.append(s1.charAt(i));
	System.out.println(sb);
	}
}