
public class ex06 {

	public static void main(String[] args) 
	{
		NumArrayController nums = new NumArrayController();
		nums.display("Display initial dataset :");
		
		int[] copy_nums = new int[nums.getSize()-1];
		for (int i=0;i<2;i++)
		{
			copy_nums[i] = nums.getNumArray() [i];
		}
		
		for (int i=2+1;i<nums.getSize();i++)
		{
			copy_nums[i-1] =nums.getNumArray() [i];
		}
		
		nums.setNumbers(copy_nums);
		nums.display("\nAfter deleted data in index 2: ");

	}

}
