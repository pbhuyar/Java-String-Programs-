
//WAP to SWAP first and last Characterof a String. 

// 3) By using sustring 

class SwapFirstandLastChar3
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