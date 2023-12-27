
public class Lab_Example701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {12, 50, 93, 45, 75, 52, 80};
		
		for(int i=0;i<nums.length;i++){
			System.out.println("nums["+ i +"] = "+nums[i]);
		}
		System.out.println("using foreach to display value from array nums");
		int j = 0;
		for (int _nums:nums) {
			System.out.println("nums["+ j++ +"] = "+_nums);
		}
		System.out.println("using Method Array");
		printArray(nums);
	}
	public static void printArray(int[] _nums) {
		for(int i=0;i<_nums.length;i++){
			System.out.println("nums["+ i +"] = "+_nums[i]);
		}
		System.out.println("using foreach to display value from array nums");
		int j = 0;
		for (int __nums:_nums) {
			System.out.println("nums["+ j++ +"] = "+__nums);
		}
	}

}
