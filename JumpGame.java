
import java.util.*;

public class JumpGame {
	public boolean canJump(int[] nums) {
    	if (nums.length == 1) {
    		return true;
    	}
    	if (nums[0] == 0) {
    		return false;
    	} 
    	for (int i = nums[0]; i >= 1; i--) {
    		if ((0+i) <= nums.length-1) {
    			int[] sublist = Arrays.copyOfRange(nums, i, nums.length);
    			boolean next = canJump(sublist);
    			if (next == true) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public static void main(String[] args) {
		JumpGame jump = new JumpGame();
		int[] nums1 = {3, 4, 5, 6};
		int[] nums2 = {1, 1, 0, 6};
		int[] nums3 = {0};
		int[] nums4 = {2, 5, 0, 0};
		int[] nums5 = {2,0,6,9,8,4,5,0,8,9,
				1,2,9,6,8,8,0,6,3,1,2,2,
				1,2,6,5,3,1,2,2,6,4,2,4,
				3,0,0,0,3,8,2,4,0,1,2,0,
				1,4,6,5,8,0,7,9,3,4,6,6,
				5,8,9,3,4,3,7,0,4,9,0,9,
				8,4,3,0,7,7,1,9,1,9,4,9,
				0,1,9,5,7,7,1,5,8,2,8,2,
				6,8,2,2,7,5,1,7,9,6};
		System.out.println(jump.canJump(nums1));
		System.out.println(jump.canJump(nums2));
		System.out.println(jump.canJump(nums3));
		System.out.println(jump.canJump(nums4));
		System.out.println(jump.canJump(nums5));

	}
}
