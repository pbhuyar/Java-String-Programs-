//WAP to Shift First Char to last of String 

// 4) By using For Delete Method of String   

class ShiftFirsttoLastDeleteMethod
{
	public static void main (String args [] )
	{
	String s1 = "India";
	StringBuilder sb = new StringBuilder(s1);
	char c = sb.charAt(0);
	sb.deleteCharAt(0);
	sb.append(c);
	System.out.println(sb);
	}
}
