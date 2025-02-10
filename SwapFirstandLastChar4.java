
//WAP to SWAP first and last Characterof a String. 

// 4) By using Delete method of String 

class SwapFirstandLastChar4
{
	public static void main (String args [] )
	{
		String s1 = "India";
	
		StringBuilder sb = new StringBuilder(s1);
		char c = sb.charAt(sb.length()-1);
		sb.insert(0,c);
		sb.deleteCharAt(sb.length()-1);
		c = sb.charAt(1);
		sb.deleteCharAt(1);
		sb.append(c);
		System.out.println(sb);
	}
}