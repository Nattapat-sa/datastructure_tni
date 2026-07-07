
public class ex01 {

	public static void main(String[] args) 
	{
		int[] num = {23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length = "+num.length);
		
		System.out.println("First element = "+num[0]);
		
		System.out.println("Last element = "+num[num.length-1]);
		
		System.out.println("Last element = "+num[num.length/2]);
		
		System.out.println("\nDisplay all elements :");
		
		for (int i=0;i<num.length;i++) {
			if (i!=0)
				System.out.print(",");
		   System.out.print(num[i]);
		}
	}

}
