

// WAP to find the sum of digits in String 

// INPUT :  welcome to  2025 ;

// OUTPUT : 9 

class SumofDigitsinString
{
	public static void main ( String args [] )
	{
		String s1 = "welcome to 2025";
		int sum =0;
		for(int i=0;i<s1.length();i++)	
		if(Character.isDigit(s1.charAt(i)))
	sum += (Character.getNumericValue(s1.charAt(i)));
		System.out.println(sum);
	}
}
	
