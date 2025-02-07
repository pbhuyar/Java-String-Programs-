//WAP to Shift first Character to last to String 

// 3) By using subString() Method of String 

class ShiftFirstToLastsubstring 
{
	public static void main (String args [] )
	{
	String s1 = "India";
	StringBuilder sb = new StringBuilder(s1.substring(1));
	sb.append(s1.charAt(0));
	System.out.println(sb);
	}
}