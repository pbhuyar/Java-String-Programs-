
// WAP to sort Digits in String ASCII value 

// INPUT : "welcome to 2025";

// OUTPUT "welcome to 0225";

class Sort
{
	public static void main (String args [] )
	{
		String s1 = "welcome to 2025";
		StringBuilder sb = new StringBuilder();
		String s2 [] = s1.split(" ");
	for(int i=0;i<s2.length;i++)
	{	
		String  temp = s2[i];
	  	if(Character.isDigit(temp.charAt(0)))
		{
	  		char c [] = temp.toCharArray();
			java.util.Arrays.sort(c);
			sb.append(new String(c));
		}
		else
 			sb.append(temp);
		if(i<s2.length-1)
			sb.append(" ");
	}
	System.out.println(sb);
	}
}
	