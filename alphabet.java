package left;

public class alphabet 
{
	static String leftrotate(String str,int d)
	{
		String ans=str.substring(d)
		+str.substring(0,d);	
		return ans;
	}

	public static void main(String[] args) {
		String str1="abcdefghijkl";
		System.out.println(leftrotate(str1,5));

	}

}
