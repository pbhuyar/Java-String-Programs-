// WAP to Shift First char to last of String 

// 2) By using StringBuilder 

class ShiftFirstToLastSBuildr 
{
	public static void main (String args [] )
	{
	 String s1 = "India";
	 StringBuilder sb = new StringBuilder ();
	 for(int i=1;i<s1.length();i++)
	 sb.append(s1.charAt(i));
	sb.append(s1.charAt(0));
	System.out.println(sb);
	}
}