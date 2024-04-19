import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseSentence {
	@Test
	public void reverse()
	{
		Scanner scan = new Scanner (System.in);
		String sentence= "Kartheek is taking interview";
		char[]characters= sentence.toCharArray();
		char a;
		for(int i =0;i<characters.length/2;i++)
		{
			a=characters[i];
			characters[i]=characters[characters.length-(i+1)];
			characters[characters.length-(i+1)]=a;
		}
		
		System.out.print(characters);
		
	}
	
	

}
