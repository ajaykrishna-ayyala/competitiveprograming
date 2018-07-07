import java.util.*;

public class anagram
{
	public static void isAnagram(String s1, String s2)
	{

		System.out.println("***************************");
		System.out.println(s1);
		System.out.println(s2);
		if(s1.length()==s2.length())
		{
			String[] ss1=s1.split("");
			String[] ss2=s2.split("");

			Arrays.sort(ss1);
			Arrays.sort(ss2);
			System.out.println(Arrays.equals(ss1,ss2));
		}
		else
			System.out.println("false");
	}
	public static void main(String[] args)
	{
		String s1="anagram";
		String s2="nagaram";
		
		isAnagram(s1.toLowerCase().replaceAll(" ",""),s2.toLowerCase().replaceAll(" ",""));

		String s3="keep";
		String s4="peek";

		isAnagram(s3.toLowerCase().replaceAll(" ",""),s4.toLowerCase().replaceAll(" ",""));

		String s5="Mother In Law";
		String s6="Hitler Woman";

		isAnagram(s5.toLowerCase().replaceAll(" ",""),s6.toLowerCase().replaceAll(" ",""));

		String s7="School Master";
		String s8="The Classroom";
		isAnagram(s7.toLowerCase().replaceAll(" ",""),s8.toLowerCase().replaceAll(" ",""));

		String s9="ASTRONOMERS";
		String s10="NO MORE STARS";

isAnagram(s9.toLowerCase().replaceAll(" ",""),s10.toLowerCase().replaceAll(" ",""));
		
		String s13="Toss";
		String s14="Shot";

isAnagram(s13.toLowerCase().replaceAll(" ",""),s14.toLowerCase().replaceAll(" ",""));
		String s15="joy";
		String s16="enjoy";
isAnagram(s15.toLowerCase().replaceAll(" ",""),s16.toLowerCase().replaceAll(" ",""));

		String s17="Debit Card";
		String s18="Bad Credit";
isAnagram(s17.toLowerCase().replaceAll(" ",""),s18.toLowerCase().replaceAll(" ",""));
		String s19="SiLeNt CAT";
		String s20="LisTen AcT";
isAnagram(s19.toLowerCase().replaceAll(" ",""),s20.toLowerCase().replaceAll(" ",""));
		String s21="Dormitory";
		String s22="Dirty Room";
isAnagram(s21.toLowerCase().replaceAll(" ",""),s22.toLowerCase().replaceAll(" ",""));



	}

}