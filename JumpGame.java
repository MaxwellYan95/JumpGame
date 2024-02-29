
import java.util.*;

public class JumpGame {
    public boolean canJump(int[] nums) {
    	if (nums.length == 1) {
    		return true;
    	}
    	for (int i = nums[0]; i >= 1; i--) {
    		if ((0+i) == nums.length-1) {
    			return true;
    		}
    		else if ((0+i) > nums.length-1) {
    			continue;
    		}
    		else {
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
		System.out.println(jump.canJump(nums1));
		System.out.println(jump.canJump(nums2));
		System.out.println(jump.canJump(nums3));
		System.out.println(jump.canJump(nums4));

	}
}
