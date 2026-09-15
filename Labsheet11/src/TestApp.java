
public class TestApp {

	public static void main(String[] args) {
		// 01
		int[] nums = { 11, 9, 23, 87, 38, 22, 92, 10 };
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		sort.printSortedData();

		System.out.println();
		Sorting sort1 = new Sorting(nums);
		sort1.bubbleSort(true);
		sort1.printSortedData();

		// 02
		System.out.println();
		int[] num2 = { 25, 11, 45, 6, 87, 20, 78, 64 };
		Sorting sort2 = new Sorting(num2);
		sort2.selectionSort();
		sort2.printSortedData();

		// 04
		System.out.println();
		int[] num3 = { 68, 10, 87, 75, 14, 36, 98, 76 };
		Sorting sort3 = new Sorting(num3);
		sort3.insertionSort();
		sort3.printSortedData();

		// 06
		System.out.println();
		int[] num4 = {87, 11, 26, 35, 49, 85, 21, 46};
		Sorting sort4 = new Sorting(num4);
		sort4.quicksort();
		sort4.printSortedData();

	}

}
