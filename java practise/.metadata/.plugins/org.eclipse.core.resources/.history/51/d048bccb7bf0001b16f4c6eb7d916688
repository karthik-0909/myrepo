package ex1;


public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s="hi this is karthik DaD";
		System.out.println(lastCharUppercase(s));
		System.out.println(MiddleorLastlettertoUppercase(s));
		System.out.println(PrintingNonPalindrome(s));
	}
	//If the word is of odd length then convert middle letter to uppercase else convert first letter to uppercase
// In every word if it is not palindrome then reverse it and print back the whole sentence.
	
	public static String lastCharUppercase(String s)
	{
		StringBuilder s1=new StringBuilder();
		String[] str=s.split(" ");
		for (int i=0;i<str.length;i++) 
		{
			s1.append(str[i].substring(0,str[i].length()-1)).append(Character.toUpperCase(str[i].charAt(str[i].length()-1))).append(" ");
		}
		return s1.toString();
	}
	public static String MiddleorLastlettertoUppercase(String s) {
		StringBuilder s2=new StringBuilder();
		String[] st=s.split(" ");
		for (int i=0;i<st.length;i++) {
			if (st[i].length()%2!=0)
			{
				s2.append(st[i].substring(0,st[i].length()/2)).append(Character.toUpperCase(st[i].charAt(st[i].length()/2))).append(st[i].substring(st[i].length()/2+1)).append(" ");
			}
			else
			{
				s2.append(Character.toUpperCase(st[i].charAt(0))).append(st[i].substring(1,st[i].length())).append(" ");
			}
		}
		
		return s2.toString();
	}

	public static String PrintingNonPalindrome(String s) {
		StringBuilder s3=new StringBuilder();
		String str[]=s.split(" ");
		for (int i=0;i<str.length;i++) {
			if(new StringBuilder (str[i]).reverse().toString().equals(str[i])) {
				s3.append(str[i]).append(" ");
			}
			else {
				s3.append(new StringBuilder (str[i]).reverse().append(" "));
			}
		}
		return s3.toString();
	}
}
