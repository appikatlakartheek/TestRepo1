
public class MissinginArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {6,2,3,4,1};
		int i;
		for (i=0;i<6;)
		{
			if (arr[i]==i+1)
			{
				i++;
			}
			
			else
			{
				break;
			}

}
		
		System.out.println("The missing number is "+(i+1));

	}

}
