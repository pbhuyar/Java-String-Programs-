// WAP to Shift Last char to First of String 

// 4) by Using Insert () method of String 

class ShiftLastToFirstInsertMethod 
{
	public static void main (String args [] )
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1);
		sb.insert(0,sb.charAt(sb.length()-1));
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}