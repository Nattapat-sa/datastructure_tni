
public class ex04 {

	public static void main(String[] args) 
	{
		NumArrayController nums = new NumArrayController();
		nums.display("Display initial dataset :");
		
		int[] copy_nums = new int[nums.getSize()-1];
		
		for (int i=0;i<copy_nums.length;i++) 
		{
			copy_nums[i] = nums.getNumArray() [i+1];
		}
		nums.setNumbers(copy_nums);
		nums.display("\nAfter deleted the first element :");


	}

}
