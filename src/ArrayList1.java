import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kartheek");
		a.add("Neelima");
		a.add("Nandan");
		a.add("Kundan");
		
		for (String val :a)
		{
			System.out.println(val);
		}
		if(a.contains("Nandan"))
		{
			System.out.println("Name is present");
			System.out.println(a.get(3));
		}
		//Convert Arrays to Arraylist
		
		String arr[] = {"Jaan","Maan","Soon","Toon"};
		List<String> arrayListConv = Arrays.asList(arr);
		System.out.println(arrayListConv.get(2));
		
	}

}
