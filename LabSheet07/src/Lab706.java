import javax.swing.*;
public class Lab706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		
		int indexNum = Integer.parseInt(JOptionPane.showInputDialog("input index of array:"));
		while(checkIndex(nums,indexNum)) {
			indexNum = Integer.parseInt(JOptionPane.showInputDialog("input index of array, again:"));
		}
		if((prevData(nums,indexNum)!=-1) && ((nextData(nums,indexNum))!=-1) ) {
		JOptionPane.showMessageDialog(null,"Current data, nums["+indexNum+"] is "+currentData(nums,indexNum)
		+"\nPrevious data, nums["+(indexNum-1)+"] is "+prevData(nums,indexNum)
		+"\nNext data, nums["+(indexNum+1)+"] is "+nextData(nums,indexNum));
		}
		else if(prevData(nums,indexNum)==-1) {
			JOptionPane.showMessageDialog(null,"Current data, nums["+indexNum+"] is "+currentData(nums,indexNum)
			+"\nNo previous data"
			+"\nNext data, nums["+(indexNum+1)+"] is "+nextData(nums,indexNum));
		}
		else if((nextData(nums,indexNum))==-1) {
			JOptionPane.showMessageDialog(null,"Current data, nums["+indexNum+"] is "+currentData(nums,indexNum)
			+"\nPrevious data, nums["+(indexNum-1)+"] is "+prevData(nums,indexNum)
			+"\nNo next data");
		}
	}
	public static boolean checkIndex(int[] number , int index) {
		/*if ((index >= number.length || index < 0)) {
			return true;
		}
		else {
			return false;
		}*/
		return (index >= number.length || index < 0)?true:false;
		 
	}
	public static int currentData(int[] number, int index) {
		return number[index];
	}
	public static int prevData(int[] number, int index) {
		if((index-1)==-1) {
			return -1;
		}
		return number[index-1];
	}
	public static int nextData(int[] number, int index) {
		if((index+1)==number.length) {
			return -1;
		}
		return number[index+1];
	}

}
