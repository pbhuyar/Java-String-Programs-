
//WAP to SWAP first and last Characterof a String. 

// 1) By using StringBuilder Class 

class SwapFirstandLastChar
{
	public static void main (String args [] )
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		sb.append(s1.substring(1,s1.length()-1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}