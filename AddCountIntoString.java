// WAP to add count in String 

// Input : "International";
// Output :  I13n12t11e10r9n8a7t6i5o4n3a2l1 

class AddCountIntoString 
{
	public static void main (String args [] )
	{
	 String s1 =  "International";
	 int count =0;
	 StringBuilder sb = new StringBuilder(s1);
	 for (int i=s1.length()-1;i>=0;i--)
	  sb.insert(i+1, ++count);
  	 System.out.println(sb);
	}
}