import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseSentence2 {

	public static void reverse(String sentence)
	{

		String[] splitwords=sentence.split(" ");
		String s;
		for (int i=0;i<splitwords.length/2;i++)
		{
			s= splitwords[i] ;
			splitwords[i]= splitwords[splitwords.length-(i+1)];
			splitwords[splitwords.length-(i+1)]=s;
		}
		
	String reversesen = String.join(" ", splitwords);
	System.out.println(reversesen);
		
	}
	
	public static void main()
	{
		
		String sentence= "Kartheek is taking interview";
		reverse( sentence);
	}

}
