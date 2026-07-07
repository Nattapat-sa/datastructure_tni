
public class ex03 {

	public static void main(String[] args) 
	{
		NumArrayController nums = new NumArrayController();
		nums.display("Display initial dataset :");
		
		int[] copy_nums = new int[nums.getSize()+1];
		
		for (int i=0;i<nums.getSize();i++) 
		{
			copy_nums[i] = nums.getNumArray() [i];		
		}
		
		nums.setNumbers(copy_nums);
		nums.display("\nAfter add 1 element size :");
		
		nums.getNumArray() [nums.getSize()-1] =15;
		
		nums.display("\nAfter add 15 : ");

	}

}
