
public class sumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,40};
		int total=0;
		try {
			total= sumArray(array);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(total);
	}
	
	public static int sumArray(int [] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
		sum=sum+array[i];
		}
		return sum;
		
	}

}
