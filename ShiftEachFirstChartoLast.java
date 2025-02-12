
// WAP to Shift first Character from each word at last of a // String ..

// INPUT : Hello i am java developer 
// OUTPUT : ello m ava eveloper Hiajd  


class ShiftEachFirstChartoLast
{
	public static void main (String args [] )
	{
		String s1 = "Hello i am java developer";
		String s2 []  = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		StringBuilder last = new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			sb.append(s2[i].substring(1));
			last.append(s2[i].charAt(0));
			sb.append(" ");
		}
		sb.append(last);
		System.out.println(sb);
	}
}