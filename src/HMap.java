import java.util.HashMap;
import java.util.Scanner;

public class HMap {

	public static void main(String[] args) {
    
	HashMap<String,String> hm=getData();
	Scanner scan = new Scanner(System.in);
	System.out.println(hm.get(scan.next()));
		

	}
	
	public static HashMap<String, String> getData()
	{
		HashMap<String,String> hm= new HashMap<String,String>();
		hm.put("Sachin", "Batsmen");
		hm.put("Srinath", "Bowler");
		hm.put("Kumble", "Bowler");
		return hm;
	}

}
