//WAP to Shift First Char to last of String 

// 1) By using For SecondString 


class ShiftFirstToLastSecondString
{
	public static void main (String args [] )
	{
	String s1 = "India";
	String s2 = "";
	for (int i=1;i<s1.length();i++)
	s2 += s1.charAt(i);
	s2 +=s1.charAt(0);
	System.out.println(s2);
	}
} 
